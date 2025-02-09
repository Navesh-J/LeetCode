class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int n=s.length();
        int ca[]=new int[26];
        int cb[]=new int[26];
        for(int i=0;i<n;i++){
            ca[s.charAt(i)-'a']++;
            cb[t.charAt(i)-'a']++;
        }
        return Arrays.equals(ca,cb);
    }
}