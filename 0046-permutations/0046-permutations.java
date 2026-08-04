class Solution {

    public static void swap(int i, int idx, int[] nums){
        int temp=nums[i];
        nums[i]=nums[idx];
        nums[idx]=temp;
    }

    public static void permutation(List<List<Integer>> res, int idx, int[] nums){

        if(idx==nums.length){
            ArrayList<Integer> temp=new ArrayList<>();
            for(int num:nums){
                temp.add(num);
            }
            res.add(temp);
            return;
        }
        HashSet<Integer> appeared=new HashSet<>();
        for(int i=idx;i<nums.length;i++){
            if(appeared.add(nums[i])){
            swap(i,idx,nums);

            permutation(res, idx+1, nums);

            swap(i,idx,nums);
        }}
    }


    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        permutation(res,0,nums);
        return res;
    }
}