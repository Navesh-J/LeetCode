class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        int c=grid[0].length;
        int r=grid.length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]<0)
                count++;
            }
        }
        return count;
    }
}