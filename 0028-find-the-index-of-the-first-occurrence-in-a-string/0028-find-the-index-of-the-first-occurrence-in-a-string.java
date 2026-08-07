class Solution {
    public int strStr(String haystack, String needle) {
        int haystackLength = haystack.length();
        int needleLength = needle.length();

        if (needleLength > haystackLength) {
            return -1;
        }

        for (int i = 0; i <= haystackLength - needleLength; i++) {
            int n = 0;
            while (n < needleLength && haystack.charAt(i + n) == needle.charAt(n)) {
                n++;
            }

            if (n == needleLength) {
                return i;
            }
        }

        return -1;
    }
}