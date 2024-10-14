class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int num:nums)
        pq.add(num);
        long score=0;
        while(k-->0){
            int i=pq.poll();
            score+=i;
            i=(int)Math.ceil(i/3.0);
            pq.add(i);
        }
        return score;
    }
}