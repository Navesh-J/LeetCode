class Solution {
    private String reverse(String str){
        StringBuilder sb=new StringBuilder(str);
        return sb.reverse().toString();
    }
    public String reverseStr(String s, int k) {
        int index=0;
        String str="";
        while(index<s.length()){
            str+=reverse(s.substring(index,Math.min(index+k,s.length())));
            if(index+k<s.length())
            str+=s.substring(index+k,Math.min(index+2*k,s.length()));
            index+=(2*k);
        }
        return str;
    }
}