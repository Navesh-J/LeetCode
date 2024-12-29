class Solution {
    public int minimumOperations(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int res=0;
        for(int j=0;j<c;j++){
            for(int i=0;i<r-1;i++){
                if(grid[i][j]>=grid[i+1][j]){
                    int diff=grid[i][j]-grid[i+1][j]+1;
                    grid[i+1][j]+=diff;
                    res+=diff;
                }
            }
        }
        return res;
    }
}