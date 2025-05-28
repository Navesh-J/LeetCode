class Solution {
    public long minCuttingCost(int n, int m, int k) {
        long res;
        long len1=0,len2=0;
        if(n<=k && m<=k) return 0;
        long max = max=Math.max(m,n);
        len1 = k;
        len2 = max-k;
        return len1*len2;
    }
}