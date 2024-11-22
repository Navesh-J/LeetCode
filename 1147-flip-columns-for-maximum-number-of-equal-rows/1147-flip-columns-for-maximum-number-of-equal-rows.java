class Solution {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        Map<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < m; i++) {
            String row = rowToString(matrix[i]);
            String flippedRow = rowToString(flipRow(matrix[i]));
            
            map.put(row, map.getOrDefault(row, 0) + 1);
            map.put(flippedRow, map.getOrDefault(flippedRow, 0) + 1);
        }
        
        int maxRows = 0;
        for (int count : map.values()) {
            maxRows = Math.max(maxRows, count);
        }
        
        return maxRows;
    }
    
    private String rowToString(int[] row) {
        StringBuilder sb = new StringBuilder();
        for (int num : row) {
            sb.append(num);
        }
        return sb.toString();
    }
    
    private int[] flipRow(int[] row) {
        int[] flipped = new int[row.length];
        for (int i = 0; i < row.length; i++) {
            flipped[i] = row[i] == 0 ? 1 : 0;
        }
        return flipped;
    }
}
