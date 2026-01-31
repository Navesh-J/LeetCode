class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char res=letters[0];
        for(char l:letters){
            if(l>target){
                return l;
            }
        }
        return res;
    }
}