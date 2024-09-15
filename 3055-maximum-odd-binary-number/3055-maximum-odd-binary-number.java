class Solution {
    public String maximumOddBinaryNumber(String s) {
        int c=0;
        for(char ch:s.toCharArray()){
            if(ch=='1')
            c++;
        }
        int len=s.length();
        String str="";
        while(len>1){
            if(c>1){
                str+="1";
                c--;
            }
            else
            str+="0";
            len--;
        }
        str+="1";
        return str;
    }
}