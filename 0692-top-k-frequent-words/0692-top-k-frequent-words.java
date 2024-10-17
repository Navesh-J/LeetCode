class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map=new HashMap<>();
        for(String word:words){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        PriorityQueue<String> pq=new PriorityQueue<>( (a,b) -> {
            if(map.get(a).equals(map.get(b)))
            return a.compareTo(b);
            return map.get(b)-map.get(a);
        } );
        for(String word:map.keySet())
        pq.offer(word);
        List<String> list=new ArrayList<>();
        while(k-->0)
        list.add(pq.poll());
        return list;
    }
}