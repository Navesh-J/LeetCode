class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> rows=new HashSet<>();
        Set<Integer> columns=new HashSet<>();
        int r=matrix.length;
        int c=matrix[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]==0){
                    rows.add(i);
                    columns.add(j);
                }
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(rows.contains(i) || columns.contains(j) ){
                    matrix[i][j]=0;
                }
            }
        }
    }
}