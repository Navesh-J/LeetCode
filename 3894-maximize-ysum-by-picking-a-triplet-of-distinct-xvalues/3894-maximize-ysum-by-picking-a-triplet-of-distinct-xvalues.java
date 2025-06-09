class Solution {
    public int maxSumDistinctTriplet(int[] x, int[] y) {
        Map<Integer,Integer> map = new HashMap<>();
        int n=x.length;
        for(int i=0;i<n;i++){
            int value = y[i];
            if(map.containsKey(x[i])){
                value=map.get(x[i]);
            }
            map.put(x[i],Math.max(value,y[i]));
        }
        if(map.size() < 3)
            return -1;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int value:map.values()){
            pq.offer(value);
        }
        return (pq.poll()+pq.poll()+pq.poll());
    }
}