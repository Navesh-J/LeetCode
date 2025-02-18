class Solution {
    public String smallestNumber(String pattern) {
        Stack<Integer> st=new Stack<>();
        int c=2;
        st.add(1);
        String res="";
        for(int i=0;i<=pattern.length();i++){
            if(i==pattern.length() || pattern.charAt(i) == 'I'){
                while(!st.isEmpty()){
                    res+=Integer.toString(st.pop());
                }
            }
            st.add(c++);
        }
        return res;
    }
}