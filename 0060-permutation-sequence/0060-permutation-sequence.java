class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> list=new ArrayList<>();
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            list.add(i);
            fact*=i;
        }
        k--;
        fact/=n;
        StringBuilder sb=new StringBuilder();
        for(int i=n-1;i>=1;i--)
        {
            int curr=k/fact;
            sb.append(String.valueOf(list.get(curr)));
            list.remove(curr);
            k%=fact;
            fact/=i;
        }
        sb.append(String.valueOf(list.get(0)));
        return sb.toString();
    }
}