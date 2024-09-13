class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int len=queries.length;
        int res[]=new int[len];
        for(int i=0;i<len;i++){
            int left=queries[i][0];
            int right=queries[i][1];
            for(int j=left;j<=right;j++){
                res[i]^=arr[j];
            }
        }
        return res;
    }
}