class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        int n=k;
        while(true)
        {
            if(!set.contains(n))
            {
                break;
            }
            n+=k;
        }
        return n;
    }
}