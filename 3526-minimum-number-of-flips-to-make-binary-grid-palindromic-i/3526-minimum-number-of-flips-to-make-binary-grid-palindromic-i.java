class Solution {
    public int minFlips(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int fr = 0, fc = 0;
        for (int i = 0; i < r; i++) {
            int left = 0, right = c - 1;
            while (left < right) {
                if (grid[i][left] != grid[i][right])
                    fc++;
                left++;
                right--;
            }
        }

        for(int i=0;i<c;i++){
            int left=0,right=r-1;
            while(left<right){
                if(grid[left][i]!=grid[right][i])
                    fr++;
                left++;
                right--;
            }
        }

        return Math.min(fr, fc);
    }
}