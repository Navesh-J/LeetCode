class Solution {
    public long findScore(int[] nums) {
        int n=nums.length;
        long score=0;
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->{
            if(a[1]==b[1]) return a[0]-b[0];
            else return a[1]-b[1];
        });
        for(int i=0;i<n;i++){
            pq.offer(new int[]{i,nums[i]});
        }
        boolean marked[]=new boolean[n];
        while(!pq.isEmpty()){
            int[] num=pq.poll();
            int index=num[0];
            int value=num[1];
            if(marked[index])         {
                continue;
            }
            score+=value;
            marked[index]=true;
            if(index<n-1)
                marked[index+1]=true;
            if(index>0)
                marked[index-1]=true;
        }
        return score;
    }
}