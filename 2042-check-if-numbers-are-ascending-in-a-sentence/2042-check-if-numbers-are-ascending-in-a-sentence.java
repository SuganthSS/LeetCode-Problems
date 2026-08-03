class Solution {
    public boolean areNumbersAscending(String s) {
        String[] arr=s.split(" ");
        int min=0;
        for(String i:arr)
        {
            if(i.matches("\\d+"))
            {
                int temp=Integer.parseInt(i);
                if(temp>min)
                {
                    min=temp;
                }
                else
                {
                    return false;
                }
            }
        }
        return true;
    }
}