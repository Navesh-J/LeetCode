import java.util.*;
class Solution {
    public boolean wordPattern(String pattern, String s) {
        StringTokenizer obj=new StringTokenizer(s);
        if(obj.countTokens()!=pattern.length())
        return false;
        HashMap<Character,String> map=new HashMap<>();
        HashMap<String,Character> pam=new HashMap<>();
        for(char key:pattern.toCharArray()){
            String value=obj.nextToken();
            if(map.containsKey(key)){
                if(!(map.get(key).equals(value))){
                    return false;
                }
            }
            else
            map.put(key,value);
            if(pam.containsKey(value)){
                if(pam.get(value)!=key)
                return false;
            }
            else
            pam.put(value,key);
        }
        return true;
    }
}