class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int pile:piles){
            pq.add(pile);
        }
        while(k-->0){
            int n=pq.poll();
            n-=(int)(n/2);
            pq.add(n);
        }
        int sum=0;
        for(int num:pq){
            sum+=num;
        }
        return sum;
    }
}