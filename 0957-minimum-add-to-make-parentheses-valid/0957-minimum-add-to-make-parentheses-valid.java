class Solution {
    public int minAddToMakeValid(String s) {
        if(s=="")
        return 0;
        StringBuilder sb=new StringBuilder();
        int count=0;
        for(char ch:s.toCharArray()){
            if(ch=='(')
            sb.append(ch);
            else if(ch==')'){
                int index=sb.lastIndexOf("(");
                if(index==-1)
                count++;
                else
                sb.deleteCharAt(index);
            }
        }
        count+=sb.length();
        return count;
    }
}