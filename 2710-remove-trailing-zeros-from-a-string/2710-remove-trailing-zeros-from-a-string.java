class Solution {
    public String removeTrailingZeros(String num) {
        int n=0;
        for(int i=num.length()-1;i>=0;i--){
            if(num.charAt(i)=='0'){
                n++;
            }
            else{
                break;
            }
        }
        String s=num.substring(0,num.length()-n);
        return s;
    }
}