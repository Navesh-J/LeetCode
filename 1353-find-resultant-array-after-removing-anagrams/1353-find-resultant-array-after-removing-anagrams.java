class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> res = new ArrayList<>();
        String prev="";
        for(String word:words){
            if(!isAnagram(prev,word)){
                res.add(word);
                prev=word;
            }
        }
        return res;
    }
    private boolean isAnagram(String s1,String s2){
        if(s1.length() != s2.length()) return false;
        int []freq = new int[26];
        for(char ch:s1.toCharArray())
            freq[ch-'a']++;
        for(char ch:s2.toCharArray()){
            if(--freq[ch-'a']<0) return false;
        }
        return true;
    }
}