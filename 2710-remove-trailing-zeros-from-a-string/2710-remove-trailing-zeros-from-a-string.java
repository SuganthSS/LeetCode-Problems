class Solution {
    public String removeTrailingZeros(String num) {
        Stack<Character> stack=new Stack<>();
        for(char c:num.toCharArray())
        {
            stack.push(c);
        }
        while(stack.peek()=='0')
        {
            stack.pop();
        }
        StringBuilder sb=new StringBuilder();
        while(!stack.isEmpty())
        {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}