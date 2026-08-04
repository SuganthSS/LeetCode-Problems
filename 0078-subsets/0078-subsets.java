class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        backtrack(nums,list,temp,0);
        return list;
    }

    public static void backtrack(int[] nums,List<List<Integer>> list,List<Integer> temp,int idx)
    {
        if(idx==nums.length)
        {
            list.add(new ArrayList<>(temp));
            return;
        }

        temp.add(nums[idx]);
        backtrack(nums,list,temp,idx+1);
        temp.remove(temp.size()-1);
        backtrack(nums,list,temp,idx+1);
    }
}