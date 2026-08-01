class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int odd=1;
        int even=0;
        while(odd < nums.length && even < nums.length)
        {
            if(nums[odd]%2!=0)
            {
                odd+=2;
            }
            else if(nums[even]%2==0)
            {
                even+=2;
            }
            else
            {
                int temp=nums[odd];
                nums[odd]=nums[even];
                nums[even]=temp;
                odd+=2;
                even+=2;
            }
        }
        return nums;
    }
}