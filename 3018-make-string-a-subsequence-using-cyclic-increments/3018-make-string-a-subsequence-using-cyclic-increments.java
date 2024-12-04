class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int i=0,j=0;
        int n=str1.length();
        while(i!=n){
            char a=str1.charAt(i);
            char b;
            if(j<str2.length())
            b=str2.charAt(j);
            else
            break;
            char newChar=(char)(a+1);
            if(a=='z')
            newChar='a';
            if((a==b) || (newChar==b) ){
                j++;
            }
            i++;
        }
        if(j==str2.length())
        return true;
        return false;
    }
}