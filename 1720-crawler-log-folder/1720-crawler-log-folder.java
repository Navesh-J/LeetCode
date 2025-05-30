class Solution {
    public int minOperations(String[] logs) {
        int res=0;
        Stack<String> st = new Stack<>();
        for(String log:logs){
            if(log.equals("./")) continue;
            if(st.isEmpty() && log.equals("../")) continue;
            if(log.equals("../")){
                st.pop();
                res--;
            }else{
                st.push(log);
                res++;
            }
        }
        return res;
    }
}