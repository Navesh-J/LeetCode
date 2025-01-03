class Solution {
    public int waysToSplitArray(int[] nums) {
        int n=nums.length;
        long psum[]=new long[n];
        psum[0]=nums[0];
        for(int i=1;i<n;i++){
            psum[i]=psum[i-1]+nums[i];
        }
        int res=0;
        for(int i=0;i<n-1;i++){
            if(psum[i] >= (psum[n-1]-psum[i]))
                res++;
        }
        return res;
    }
}