class Solution {
    public String removeStars(String s) {
        StringBuilder v=new StringBuilder();
		char j[]=s.toCharArray();
		for(int i=0;i<j.length;i++){
		    if(j[i]=='*'){
		        v.deleteCharAt(v.length()-1);
		    }
		    else{
		        v.append(j[i]);
		    }
		}
        return v.toString();  
    }
}