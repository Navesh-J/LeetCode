class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum=0,res=sum;
        int n=accounts[0].length;
        int m=accounts.length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                sum+=accounts[i][j];
            }
            res=Math.max(res,sum);
            sum=0;
        }
        return res;
    }
}