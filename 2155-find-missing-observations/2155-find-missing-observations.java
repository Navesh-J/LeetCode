class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int miss[]=new int[n];
        int m=rolls.length;
        int partsum=0;
        for(int i=0;i<m;i++)
        partsum+=rolls[i];
        int rem=((m+n)*mean)-partsum;
        if(rem>6*n || rem<n)
        return new int[0];
        for(int i=0;i<n;i++)
        miss[i]=1;
        rem=rem-n;
        for(int i=0;i<n&&rem>0;i++){
            int max=6-miss[i];
            int add=Math.min(max,rem);
            miss[i]+=add;
            rem-=add;
        }
        return miss;
    }
}