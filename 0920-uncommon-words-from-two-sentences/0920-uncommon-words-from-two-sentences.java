class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String,Integer> map1=new HashMap<>();
        Map<String,Integer> map2=new HashMap<>();
        List<String> list=new ArrayList<>();
        for(String word:s1.split(" ")){
            map1.put(word,map1.getOrDefault(word,0)+1);
        }
        for(String word:s2.split(" ")){
            map2.put(word,map2.getOrDefault(word,0)+1);
        }
        for(String key:map1.keySet()){
            if(map1.get(key)==1 && !map2.containsKey(key))
            list.add(key);
        }
        for(String key:map2.keySet()){
            if(map2.get(key)==1 && !map1.containsKey(key))
            list.add(key);
        }
        String str[]=new String[list.size()];
        for(int i=0;i<list.size();i++){
            str[i]=list.get(i);
        }
        return str;
    }
}