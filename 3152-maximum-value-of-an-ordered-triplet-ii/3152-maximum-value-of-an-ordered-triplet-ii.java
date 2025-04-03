class Solution {
    public long maximumTripletValue(int[] nums) {
        long res=0;
        int n=nums.length;
        int imax=0,dmax=0;
        for(int num:nums){
            res=Math.max(res,(long)dmax*num);
            dmax=Math.max(dmax,imax-num);
            imax=Math.max(imax,num);
        }
        return res;
    }
}