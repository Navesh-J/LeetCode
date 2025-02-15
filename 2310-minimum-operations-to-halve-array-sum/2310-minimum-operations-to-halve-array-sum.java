class Solution {
    public int halveArray(int[] nums) {
        double sum=0;
        PriorityQueue<Double> pq=new PriorityQueue<>((a,b)-> Double.compare(b,a));
        for(double num:nums){
           sum+=num;
           pq.offer(num);
        }
        double total = sum;
        int res=0;
        while(sum > total/2){
            double top = pq.poll();
            sum-=top;
            top/=2;
            sum+=top;
            pq.offer(top);
            res++;
        }
        return res;
    }
}