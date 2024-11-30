class Solution {
    public int numberOfSpecialChars(String word) {
        int count=0;
        for(char ch='a';ch<='z';ch++){
            char CH=Character.toUpperCase(ch);
            int x=word.lastIndexOf(ch);
            int y=word.indexOf(CH);
            if(x>-1 && y>-1){
                if(x<y)
                    count++;
            }
        }
        return count;
    }
}