class Solution {
    public String replaceDigits(String s) {
        StringBuilder ans = new StringBuilder();
        int n = s.length();
        for(int i=0;i<n;i++){
            if(i%2==0){
                ans.append(s.charAt(i));
            }
            else{
                int shift = s.charAt(i) - '0';
                char ch = (char) (s.charAt(i-1) + shift);
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}