class Solution {
    public long pickGifts(int[] gifts, int k) {
        long res=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)-> (b-a));
        for(int gift:gifts){
            pq.offer(gift);
        }
        while(k-->0){
            int num=(int)Math.floor(Math.sqrt(pq.poll()));
            pq.offer(num);
        }
        while(!pq.isEmpty()){
            res+=pq.poll();
        }
        return res;
    }
}