class Solution {
    public boolean check(int[] nums) {
        int[] res=Arrays.copyOf(nums,nums.length);
        Arrays.sort(res);
        if(Arrays.toString(nums).equals(Arrays.toString(res))) return true;
        for(int i=0;i<nums.length;i++)
        {
            int first=nums[0];
            for(int j=0;j<nums.length-1;j++)
            {
                nums[j]=nums[j+1];
            }
            nums[nums.length-1]=first;
            if(Arrays.toString(nums).equals(Arrays.toString(res))) return true;
        }
        return false;
    }
}