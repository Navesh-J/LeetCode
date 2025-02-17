class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int res=nums[0];
        int maxArr=nums[0];
        for(int i=1;i<n;i++){
            maxArr=Math.max(maxArr+nums[i],nums[i]);
            res=Math.max(res,maxArr);
        }
        return res;
    }
}