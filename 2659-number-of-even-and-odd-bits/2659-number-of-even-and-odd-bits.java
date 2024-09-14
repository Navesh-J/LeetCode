class Solution {
    public int[] evenOddBit(int n) {
        int even=0,odd=0;
        while(n>0){
            if((n&1)==1)
            odd++;
            if((n&2)==2)
            even++;
            n=n>>2;
        }
        return new int[]{odd,even};
    }
}