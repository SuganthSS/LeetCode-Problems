class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set=new HashSet<>();
        for(int i=0;i<allowed.length();i++)
        {
            set.add(allowed.charAt(i));
        }
        int count=0;
        for(String s:words)
        {
            boolean result=true;
            for(char ch:s.toCharArray())
            {
                if(!(set.contains(ch)))
                {
                    result=false;
                    continue;
                }
            }
            if(result)
            {
                count++;
            }
        }
        return count;
    }
}