class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String word=strs[0];
        String prefix="";
        for(char ch:word.toCharArray()){
            prefix+=ch;
            for(String s:strs){
                if(!s.startsWith(prefix)){
                    return prefix.substring(0,prefix.length()-1);
                }
            }
        }
        return prefix;
    }
}