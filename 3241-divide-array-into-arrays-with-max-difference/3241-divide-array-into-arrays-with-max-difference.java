class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int r=nums.length/3,c=3;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num:nums)
            pq.offer(num);
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j] = pq.poll();
                if(j != 0){
                    if((arr[i][j]-arr[i][0]) > k)
                        return new int[][]{};
                }
            }
        }
        return arr;
    }
}