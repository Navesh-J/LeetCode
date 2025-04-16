class Solution {
    public int fillCups(int[] arr) {
        int res=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int num:arr){
            if(num!=0)
                pq.offer(num);
        }
        while(!pq.isEmpty()){
            while(pq.contains(0))
                pq.remove(0);
            if(pq.isEmpty()) break;
            if(pq.size() > 1){
                res++;
                int a = pq.poll();
                int b = pq.poll();
                pq.offer(a-1);
                pq.offer(b-1);
            }else if(pq.size() == 1){
                res++;
                pq.offer(pq.poll()-1);
            }
        }
        return res;
    }
}