class Solution {
    private boolean isPrime(int n){
        if (n <= 1) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i == 0) return false;
        }
        return true;
    }
    public boolean checkPrimeFrequency(int[] nums) {
        int count[] = new int[101];
        for(int num:nums){
            count[num]++;
        }
        for(int c:count){
            if(isPrime(c)) return true;
        }
        return false;
    }
}