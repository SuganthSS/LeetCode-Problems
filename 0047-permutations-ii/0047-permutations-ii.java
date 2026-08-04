class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        boolean[] visited=new boolean[nums.length];
        backtrack(nums,list,temp,visited);
        return list;
    }

    public static void backtrack(int[] nums,List<List<Integer>> list,List<Integer> temp,boolean[] visited)
    {
        if(temp.size()==nums.length)
        {
            if(!(list.contains(temp)))
            {
                list.add(new ArrayList<>(temp));
                return;
            }
            return;
        }

        for(int i=0;i<nums.length;i++)
        {
            if(visited[i]) continue;

            visited[i]=true;
            temp.add(nums[i]);

            backtrack(nums, list, temp, visited);

            temp.remove(temp.size()-1);
            visited[i]=false;
        }
    }
}