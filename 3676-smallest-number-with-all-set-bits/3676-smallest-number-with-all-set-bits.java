class Solution {
    public int smallestNumber(int n) {
        if(n==1) return 1;
        int ans = 1;
        while(ans<=n){
            ans*=2;
        }
        return ans-1;
    }
}