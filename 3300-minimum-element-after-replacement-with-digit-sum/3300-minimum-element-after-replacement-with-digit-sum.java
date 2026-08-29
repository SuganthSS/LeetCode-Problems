class Solution {
    public int minElement(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            nums[i] = digitsum(nums[i]);
        }
        int result=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<result)
            {
                result=nums[i];
            }
        }
        return result;
    }

    public int digitsum(int n)
    {
        int sum=0;
        while(n!=0)
        {
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}