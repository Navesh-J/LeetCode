class Solution {
    public int countSubarrays(int[] nums) {
        int n=nums.length;
        int res=0;
        for(int i=0;i<n-2;i++){
            int a=nums[i];
            int b=nums[i+1];
            int c=nums[i+2];
            if((a+c) == (b/2.0))
                res++;
        }
        return res;
    }
}