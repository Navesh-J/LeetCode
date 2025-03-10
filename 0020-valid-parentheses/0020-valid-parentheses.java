class Solution {
    private char convert(char ch){
        if(ch==')') return '(';
        if(ch=='}') return '{';
        else return '[';
    }
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='{' || ch=='(' || ch=='[')
                st.push(ch);
            else 
                if(!st.isEmpty() && st.peek() == convert(ch))
                    st.pop();
                else
                    return false;
        }
        return st.isEmpty();
    }
}