class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int r=matrix.length;
        int c=matrix[0].length;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                pq.offer(matrix[i][j]);
            }
        }
        while(k-->1){
            pq.poll();
        }
        return pq.poll();
    }
}