class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray())
        {
            if(Character.isLetter(c) || Character.isDigit(c))
            {
                sb.append(c);
            }
        
        }
        StringBuilder sb1=new StringBuilder(sb);
        return sb1.toString().equalsIgnoreCase(sb.reverse().toString());
    }
}