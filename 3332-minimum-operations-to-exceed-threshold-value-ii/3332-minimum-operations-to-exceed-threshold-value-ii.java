class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq=new PriorityQueue<>();
        for(long num:nums) pq.offer(num);
        int c=0;
        while(pq.peek()<k){
            long x=pq.poll();
            long y=pq.poll();
            long res=(Math.min(x,y)*2) + Math.max(x,y);
            pq.offer(res);
            c++;
        }
        return c;
    }
}