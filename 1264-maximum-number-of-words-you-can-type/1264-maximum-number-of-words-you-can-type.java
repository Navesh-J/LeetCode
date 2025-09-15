class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String words[] = text.split(" ");
        int res=0;
        for(String word:words){
            boolean flag = false;
            for(char ch:brokenLetters.toCharArray()){
                if(word.indexOf(ch) > -1){
                    flag=true;
                    break;
                }
            }
            if(!flag) res++;
        }
        return res;
    }
}