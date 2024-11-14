import java.util.*;
class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        String s="";
        for(String word:words){
            s=s.concat(word);
            s=s.concat(String.valueOf(separator));
        }
        StringTokenizer obj=new StringTokenizer(s,String.valueOf(separator));
        List<String> list=new ArrayList<>();
        while(obj.hasMoreTokens()){
            String str=obj.nextToken();
            if(!str.isEmpty()){
                list.add(str);
            }
        }
        return list;
    }
}