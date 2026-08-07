class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;

        for (int i = 0; i < prices.length; i++) {
            

            if (prices[i] < min) {
                min = prices[i];
            } else {
                int Profit = prices[i] - min;
                if (Profit > max) {
                    max = Profit;
                }
            }
        }
        return max;
    }
}