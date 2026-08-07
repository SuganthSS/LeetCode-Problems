class Solution {
    public int lengthOfLastWord(String s) {
    String a[]=s.split(" ");
    String result=a[a.length-1];
    return result.length();
    }
}