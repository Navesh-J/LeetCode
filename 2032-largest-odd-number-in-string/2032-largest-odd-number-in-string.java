class Solution {
    public String largestOddNumber(String num) {
        int n=0;
        for(int i=num.length()-1;i>=0;i--){
            int x=num.charAt(i)-'0';
            if(x%2!=0){
                n=i+1;
                break;
            }
        }
        return num.substring(0,n);
    }
}