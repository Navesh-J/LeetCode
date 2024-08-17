class Solution {
    private boolean isUpper(String s){
        for(char ch:s.toCharArray()){
            if(Character.isLowerCase(ch))
            return false;
        }
        return true;
    }
    private boolean isLower(String s){
        for(char ch:s.toCharArray()){
            if(Character.isUpperCase(ch))
            return false;
        }
        return true;
    }
    public boolean detectCapitalUse(String word) {
        if(isUpper(word)||isLower(word))
        return true;
        if(Character.isUpperCase(word.charAt(0))&&isLower(word.substring(1)))
        return true;
        return false;
    }
}