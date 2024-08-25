import java.util.*;
class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        StringTokenizer obj=new StringTokenizer(sentence);
        int index=1;
        while(obj.hasMoreTokens()){
            if(obj.nextToken().startsWith(searchWord))
            return index;
            index++;
        }
        return -1;
    }
}