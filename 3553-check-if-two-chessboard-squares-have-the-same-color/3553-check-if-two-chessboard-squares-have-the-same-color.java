class Solution {
    public boolean checkTwoChessboards(String c1, String c2) {
        int a1=(int)c1.charAt(0)-'a'+1;
        int b1=(int)c1.charAt(1)-'0';
        int a2=(int)c2.charAt(0)-'a'+1;
        int b2=(int)c2.charAt(1)-'0';
        String color1,color2;
        if((a1+b1)%2==0) color1="black";
        else color1="white";
        if((a2+b2)%2==0) color2="black";
        else color2="white";
        if(color1.equals(color2)) return true;
        return false;
    }
}