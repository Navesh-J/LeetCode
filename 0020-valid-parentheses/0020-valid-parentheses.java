class Solution {
    private char convert(char ch){
        if(ch==')') return '(';
        if(ch=='}') return '{';
        return '[';
    }
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='[')
            stack.push(ch);
            else{
                if(!stack.isEmpty() && convert(ch) == stack.peek())
                stack.pop();
                else
                return false;
            }
        }
        return stack.isEmpty();
    }
}