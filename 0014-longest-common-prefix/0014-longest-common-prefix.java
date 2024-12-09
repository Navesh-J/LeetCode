class Solution {
    public String longestCommonPrefix(String[] strs) {
        String word=strs[0];
        for(String s:strs){
            if(s.length()<word.length())
            word=s;
        }
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