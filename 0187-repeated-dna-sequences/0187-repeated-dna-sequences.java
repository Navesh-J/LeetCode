class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> list=new ArrayList<>();
        Map<String,Integer> map=new HashMap<>();
        for(int i=0;i<=s.length()-10;i++){
            String str=s.substring(i,i+10);
            map.put(str,map.getOrDefault(str,0)+1);
        }
        for(String key:map.keySet()){
            int value=map.get(key);
            if(value > 1){
                list.add(key);
            }
        }
        return list;
    }
}