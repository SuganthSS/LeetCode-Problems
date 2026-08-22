class Solution {
    public boolean checkDivisibility(int n) {
        int sum=sumof(n);
        int product=productof(n);
        if(n%(sum+product)==0)
        {
            return true;
        }
        else return false;
    }
    public static int sumof(int n)
    {
        int sum=0;
        while(n!=0)
        {
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    public static int productof(int n)
    {
        int product=1;
        while(n!=0)
        {
            product*=n%10;
            n/=10;
        }
        return product;
    }
}