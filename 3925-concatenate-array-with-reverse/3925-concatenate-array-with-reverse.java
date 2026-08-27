class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] result=new int[nums.length+nums.length];
        for(int i=0;i<nums.length;i++)
        {
            result[i]=nums[i];
        }
        int n=nums.length;
        for(int i=nums.length-1;i>=0;i--)
        {
            result[n]=nums[i];
            n++;
        }
        return result;
    }
}