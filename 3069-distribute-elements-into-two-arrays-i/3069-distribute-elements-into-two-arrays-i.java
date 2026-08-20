class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        if(nums.length<2) return nums;
        list1.add(nums[0]);
        list2.add(nums[1]);
        int ind1=0;
        int ind2=0;
        for(int i=2;i<nums.length;i++)
        {
            if(list1.get(ind1)>list2.get(ind2))
            {
                list1.add(nums[i]);
                ind1++;
            }
            else
            {
                list2.add(nums[i]);
                ind2++;
            }
        }
        list1.addAll(list2);
        int[] result = list1.stream()
                           .mapToInt(Integer::intValue)
                           .toArray();
        return result;

    }
}