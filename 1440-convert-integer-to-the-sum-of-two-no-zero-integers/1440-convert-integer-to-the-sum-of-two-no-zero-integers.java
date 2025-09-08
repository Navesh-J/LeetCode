class Solution {
    public int[] getNoZeroIntegers(int n) {
        for(int i=1;i<n;i++){
            int j=n-i;
            if(!zero(i) && !zero(j))
                return new int[]{i,j};
        }
        return new int[]{0,0};
    }
    private boolean zero(int n){
        while(n>0){
            int d=n%10;
            if(d==0) return true;
            n/=10;
        }
        return false;
    }
}