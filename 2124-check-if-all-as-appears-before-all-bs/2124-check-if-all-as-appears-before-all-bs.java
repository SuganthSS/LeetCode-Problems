class Solution {
    public boolean checkString(String s) {
        int count=0;
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)!=s.charAt(i+1))
            {
                count++;
                if(s.charAt(i)!='a' && s.charAt(i+1)!='b')
                {
                    return false;
                }
            }
        }
        return count<=1;
    }
}