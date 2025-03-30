class Solution {
    private int calc(int a,int b,String t){
        int res = 0;
        switch(t){
            case "+" -> res = a+b;
            case "-" -> res = a-b;
            case "*" -> res = a*b;
            case "/" -> res = a/b;
        }
        return res;
    }
    private boolean isOperator(String s){
        String str="/*-+";
        if(str.contains(s))
            return true;
        return false;
    }
    public int evalRPN(String[] tokens) {
        Stack<String> st=new Stack<>();
        for(String t:tokens){
            if(!isOperator(t)){
                st.push(t);
            }else{
                int b=Integer.parseInt(st.pop());
                int a=Integer.parseInt(st.pop());
                int res=calc(a,b,t);
                st.push(Integer.toString(res));
            }
        }
        return Integer.parseInt(st.peek());
    }
}