class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb=new StringBuilder();
        int count=0;
        for(char c:word.toCharArray())
        {
            if(c==ch && count==0)
            {
                count+=1;
                sb.append(c);
                sb.reverse();
            }
            else sb.append(c);
        }
        return sb.toString();
    }
}