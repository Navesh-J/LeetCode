class Solution {
    public boolean squareIsWhite(String coordinates) {
        int a=(int)coordinates.charAt(0)-'a'+1;
        int b=(int)coordinates.charAt(1)-'0';
        if((a+b)%2==0)
        return false;
        return true;
    }
}