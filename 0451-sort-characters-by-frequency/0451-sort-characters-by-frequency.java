class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        List<Map.Entry<Character,Integer>> list=new ArrayList<>(map.entrySet());
        list.sort((e1,e2)-> e2.getValue().compareTo(e1.getValue()));

        StringBuilder sb=new StringBuilder();
        for(Map.Entry<Character,Integer> entry:list){
            char c=entry.getKey();
            int f=entry.getValue();
            for(int i=0;i<f;i++)
            sb.append(c);
        }
        return sb.toString();
    }
}