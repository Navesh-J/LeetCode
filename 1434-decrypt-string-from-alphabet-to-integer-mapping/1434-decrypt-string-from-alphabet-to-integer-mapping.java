class Solution {
    public String freqAlphabets(String s) {
        // StringBuilder sb=new StringBuilder();
        int len=s.length();
        String str="";
        int i=len-1;
        while(i>=0){
            if(s.charAt(i)=='#'){
                int temp=Integer.parseInt(s.substring(i-2,i));
                temp=temp+96;
                str = (char)temp  + str;
                i-=3;
            }
            else{
                int temp=Integer.parseInt(s.substring(i,i+1));
                temp=temp+96;
                str = (char)temp + str;
                i--;
            }
        }
        return str;
    }
}