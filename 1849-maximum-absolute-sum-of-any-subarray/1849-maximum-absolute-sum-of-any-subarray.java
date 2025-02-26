class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxEnd=nums[0],res=nums[0];
        for(int i=1;i<nums.length;i++){
            maxEnd=Math.max(maxEnd+nums[i],nums[i]);
            res=Math.max(res,maxEnd);
        }
        int minEnd=nums[0],res2=nums[0];
        for(int i=1;i<nums.length;i++){
            minEnd=Math.min(minEnd+nums[i],nums[i]);
            res2=Math.min(res2,minEnd);
        }
        return Math.max(res,Math.abs(res2));
    }
}