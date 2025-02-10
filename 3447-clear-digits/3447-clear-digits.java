class Solution {
    public String clearDigits(String s) {
        Stack<Character> st=new Stack<>();
        int c=0;
        for(char ch:s.toCharArray()){
            if(!Character.isDigit(ch)) st.add(ch);
            else{
                st.pop();
            }
        }
        String str="";
        for(char ch:st){
            str+=ch;
        }
        return str;
    }
}