class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {
        List<Integer> list = new ArrayList<>();
        int r=grid.length;
        int c=grid[0].length;
        for(int i=0;i<r;i++){
            if(i%2==0){
                for(int j=0;j<c;j+=2){
                    list.add(grid[i][j]);
                }
            }
            else{
                int index=c-1;
                if(c%2!=0) index=c-2;
                for(int j=index;j>=0;j-=2){
                    list.add(grid[i][j]);
                }
            }
        }
        return list;
    }
}