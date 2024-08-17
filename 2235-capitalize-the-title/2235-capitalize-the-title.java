import java.util.*;
class Solution {
    public String capitalizeTitle(String title) {
        StringTokenizer obj=new StringTokenizer(title);
        StringBuilder str=new StringBuilder();
        while(obj.hasMoreTokens()){
            String word=obj.nextToken();
            if(word.length()<=2)
            str.append(word.toLowerCase());
            else
            str.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1).toLowerCase());
            str.append(" ");
        }
        return str.toString().trim();
    }
}