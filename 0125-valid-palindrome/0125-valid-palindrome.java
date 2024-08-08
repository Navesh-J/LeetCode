class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder st = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i)))
            st.append(s.charAt(i));
        }
        String str=st.toString().toLowerCase();
        int l=0,r=str.length()-1;
        while(l<r){
            if(str.charAt(l)!=str.charAt(r))
            return false;
            l++;
            r--;
        }
        return true;
    }
}