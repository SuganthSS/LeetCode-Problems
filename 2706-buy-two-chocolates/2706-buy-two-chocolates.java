class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int temp=money;
        for(int i=0;i<2;i++)
        {
            temp-=prices[i];
            if(temp < 0 && i<=1)
            {
                return money;
            }
            else if(temp==0 && i<1)
            {
                return money;
            }
        }
        return temp;
    }
}