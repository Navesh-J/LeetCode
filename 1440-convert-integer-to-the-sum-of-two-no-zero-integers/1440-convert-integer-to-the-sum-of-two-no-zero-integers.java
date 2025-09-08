class Solution {
    public int[] getNoZeroIntegers(int n) {
        for(int i=1;i<n;i++){
            int j=n-i;
            int ix = Integer.toString(i).indexOf('0');
            int jx = Integer.toString(j).indexOf('0');
            if(ix==-1 && jx==-1)
                return new int[]{i,j};
        }
        return new int[]{0,0};
    }
}