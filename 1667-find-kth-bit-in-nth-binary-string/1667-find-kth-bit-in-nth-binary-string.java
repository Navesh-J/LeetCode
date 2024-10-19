class Solution {
    private char flip(char ch){
        if(ch=='1')
        return '0';
        return '1';
    }
    private String invert(String s){
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            sb.setCharAt(i,flip(sb.charAt(i)));
        }
        return sb.toString();
    }
    private String reverse(String s){
        StringBuilder sb=new StringBuilder(s);
        sb=sb.reverse();
        return sb.toString();
    }
    public char findKthBit(int n, int k) {
        String s[]=new String[n];
        s[0]="0";
        for(int i=1;i<n;i++){
            s[i]=s[i-1]+"1"+reverse(invert(s[i-1]));
        }
        return s[n-1].charAt(k-1);
    }
}