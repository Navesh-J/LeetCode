class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num:nums){
            pq.offer(num);
        }
        while(k-->0){
            int n = pq.poll();
            n*=-1;
            pq.offer(n);
        }
        int sum = 0;
        for(int p:pq)
            sum+=p;
        return sum;
    }
}