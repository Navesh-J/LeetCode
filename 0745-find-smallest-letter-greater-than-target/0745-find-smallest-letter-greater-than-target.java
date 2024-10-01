class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char res=letters[0];
        for(char l:letters){
            int value=(int)l-(int)target;
            if(value>0){
                res=l;
                break;
            }
        }
        return res;
    }
}