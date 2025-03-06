class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int count[]=new int[n*n+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                count[grid[i][j]]++;
            }
        }
        int res[]=new int[2];
        for(int i=0;i<count.length;i++){
            if(count[i] == 0)
                res[1]=i;
            else if(count[i] == 2)
                res[0]=i;
        }
        return res;
    }
}