class Solution {
    public int smallestNumber(int n, int t) {
        while(true)
        {
            int pro= product(n);
            if(pro%t==0)
            {
                return n;
            }
            else
            {
                n++;
            }
        }
    }
    public int product(int n)
    {
        int pro=1;
        while(n!=0)
        {
            pro*=n%10;
            n/=10;
        }
        return pro;
    }
}