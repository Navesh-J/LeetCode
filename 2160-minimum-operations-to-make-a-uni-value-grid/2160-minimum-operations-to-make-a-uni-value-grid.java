class Solution {
    public int minOperations(int[][] grid, int x) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                list.add(grid[i][j]);
            }
        }
        Collections.sort(list);
        int median=list.get(list.size()/2);
        int count=0;
        for(int num : list){
            int diff=Math.abs(median-num);
            if(diff%x != 0)
                return -1;
            count += Math.abs((median-num)/x);
        }
        return count;
    }
}