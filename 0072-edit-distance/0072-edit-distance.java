class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length(), n = word2.length();

        int[][] dp = new int[m + 1][n + 1];
        for(int i = 1; i <= m; dp[i][0] = i++); // Inserting first column from 0 to m
        for(int i = 1; i <= n; dp[0][i] = i++); // Inserting first row from 0 to n

        for(int i = 1; i <= m; i++) {
            for(int j = 1; j <= n; j++) {
                char ch1 = word1.charAt(i - 1);
                char ch2 = word2.charAt(j - 1);

                /*  if both char are equal, then no need to perform any operation.
                    else, do any 1 operation (insert / delete / replace)               */
                
                if(ch1 == ch2) { 
                    dp[i][j] = dp[i - 1][j - 1];               
                } else { 
                    dp[i][j] = 1 + Math.min(dp[i - 1][j - 1],
                                   Math.min(dp[i][j - 1],
                                            dp[i - 1][j]));
                }
            }
        }

        return dp[m][n];
    }
}