class Solution {
    private boolean isPalindrome(String s){
        StringBuilder str=new StringBuilder(s);
        String s1=str.reverse().toString();
        if(s.equals(s1))
        return true;
        return false;
    }
    public boolean validPalindrome(String s) {
        if(isPalindrome(s))
        return true;
        int l=0,r=s.length()-1;
        StringBuilder str1=new StringBuilder(s);
        StringBuilder str2=new StringBuilder(s);
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                break;
            }
            l++;
            r--;
        }
        String s1=str1.deleteCharAt(l).toString();
        String s2=str2.deleteCharAt(r).toString();
        if(isPalindrome(s1)||isPalindrome(s2))
        return true;
        return false;
    }
}