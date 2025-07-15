class Solution {
    private boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    public boolean isValid(String word) {
        if(word.length()<3) return false;
        int cc=0,vc=0;
        for(char ch:word.toCharArray()){
            if(!Character.isLetterOrDigit(ch))
                return false;
            if(isVowel(ch)) vc++;
            else if(Character.isLetter(ch)) cc++;
        }
        return vc>=1 && cc>=1;
    }
}