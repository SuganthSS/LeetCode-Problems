class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list=new ArrayList<>();
        Arrays.sort(nums);
        int j=0;
        for (int i = nums[0]; i < nums[nums.length - 1]; i++) {
            if(i==nums[j])
            {
                j++;
                continue;
            }
            list.add(i);
        }
        return list;
    }
}