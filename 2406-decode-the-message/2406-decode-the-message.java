class Solution {
    public String decodeMessage(String key, String message) {
        Map<Character,Character> map=new HashMap<>();
        char alpha='a';
        map.put(' ',' ');
        for(char ch:key.toCharArray()){
            if(ch==' '){
                continue;
            }
            else if(!map.containsKey(ch)){
                map.put(ch,alpha++);
            }
        }
        String str="";
        for(char ch:message.toCharArray()){
            str+=map.get(ch);
        }
        return str;
    }
}