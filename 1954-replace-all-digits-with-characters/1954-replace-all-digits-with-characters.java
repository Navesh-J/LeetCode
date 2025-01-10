class Solution {
    private char shift(char ch,int x){
        char c=(char)((int)ch + x);
        return c;
    }
    public String replaceDigits(String s) {
        String str="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(i%2!=0){
                str+=shift(s.charAt(i-1),((int)(ch-'0')));
            }
            else{
                str+=ch;
            }
        }
        return str;
    }
}