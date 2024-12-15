class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            double p1 = (double)(a[0] + 1) / (a[1] + 1) - (double)a[0] / a[1];
            double p2 = (double)(b[0] + 1) / (b[1] + 1) - (double)b[0] / b[1]; 
            return Double.compare(p2,p1);
        });
        for(int[] cls:classes){
            pq.offer(cls);
        }
        while(extraStudents-->0){
            int s[]=pq.poll();
            s[0]+=1;
            s[1]+=1;
            pq.offer(s);
        }
        double avg=0;
        while(!pq.isEmpty()){
            int s[]=pq.poll();
            avg+=(double)s[0]/s[1];
        }
        return avg/classes.length;
    }
}