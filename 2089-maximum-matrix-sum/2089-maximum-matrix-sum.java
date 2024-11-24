class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        int count=0;
        long sum=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<r;i++){  
            for(int j=0;j<c;j++){
                if(matrix[i][j]<0) 
                    count++;
                min=Math.min(min,Math.abs(matrix[i][j]));
                sum+=Math.abs(matrix[i][j]);
            }
        }
        if(count%2==0)  return sum;
        return sum-2*min;
    }
}