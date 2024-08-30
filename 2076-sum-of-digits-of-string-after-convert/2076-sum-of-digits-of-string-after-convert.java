class Solution {
    public String digitsum(String n){
        int sum=0;
        for(char ch:n.toCharArray()){
            sum+=Character.getNumericValue(ch);
        }
        return Integer.toString(sum);
    }
    public int getLucky(String s, int k) {
        String str="";
        for(char ch:s.toCharArray()){
            str+=(int)ch-96;
        }
        while(k-->0){
            str=digitsum(str);
        }
        return Integer.parseInt(str);
    }
}