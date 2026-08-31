class Solution {
    public String[] findWords(String[] words) {
        String l1="qwertyuiop";
        String l2="asdfghjkl";
        String l3="zxcvbnm";
        List<String> list=new ArrayList<>();
        for(String s:words)
        {
            String temp=s;
            s=s.toLowerCase();
            if(s.chars().allMatch(c -> l1.indexOf(c) >= 0))
            {
                list.add(temp);
            }
            else if(s.chars().allMatch(c -> l2.indexOf(c) >= 0))
            {
                list.add(temp);
            }
            else if(s.chars().allMatch(c -> l3.indexOf(c) >= 0))
            {
                list.add(temp);
            }
        }
        String[] arr=list.toArray(new String[0]);
        return arr;
    }
}