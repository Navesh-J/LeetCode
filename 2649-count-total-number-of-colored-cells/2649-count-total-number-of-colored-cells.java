class Solution {
    public long coloredCells(int x) {
        long n=x;
        return ((n*n)+((n-1)*(n-1)));
    }
}