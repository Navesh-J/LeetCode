class Solution {
    public List<Integer> lexicalOrder(int n) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        for(int i=1;i<=n;i++){
            pq.offer(String.valueOf(i));
        }
        List<Integer> list = new ArrayList<>();
        while(!pq.isEmpty()){
            list.add(Integer.parseInt(pq.poll()));
        }
        return list;
    }
}