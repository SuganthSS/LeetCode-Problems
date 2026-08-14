class Solution {
    public int maximumLengthSubstring(String s) {
        char[] ch=s.toCharArray();
        char[] arr=new char[26];
        int left=0;
        int max=0;
        for(int right=0;right<ch.length;right++)
        {
            arr[ch[right] - 'a']++;
            while(arr[ch[right]-'a']>2)
            {
                arr[ch[left]- 'a']--;
                left++;
            }
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}