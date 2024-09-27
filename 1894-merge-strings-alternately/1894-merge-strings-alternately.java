class Solution {
    public String mergeAlternately(String word1, String word2) {
        String str="";
        int m=word1.length();
        int n=word2.length();
        int i;
        for(i=0;i<Math.min(m,n);i++){
            str+=word1.charAt(i);
            str+=word2.charAt(i);
        }
        while(i<m){
            str+=word1.charAt(i++);
        }
        while(i<n){
            str+=word2.charAt(i++);
        }
        return str;
    }
}