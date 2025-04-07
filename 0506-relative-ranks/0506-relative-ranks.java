class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n=score.length;
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b) -> b[0]-a[0]);
        for(int i=0;i<n;i++){
            pq.offer(new int[]{score[i],i});
        }
        String[] res = new String[n];
        int pos=0;
        while(!pq.isEmpty()){
            int index = pq.poll()[1];
            if(pos == 0)  res[index] = "Gold Medal";
            else if(pos == 1) res[index] = "Silver Medal";
            else if(pos == 2) res[index] = "Bronze Medal";
            else res[index] = Integer.toString(pos+1);
            pos++;
        }
        return res;
    }
}