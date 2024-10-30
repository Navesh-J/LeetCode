class Solution {
    private int normalMax(int[] nums){
        int res=nums[0],max=nums[0];
        for(int i=1;i<nums.length;i++){
            max=Math.max(nums[i],max+nums[i]);
            res=Math.max(res,max);
        }
        return res;
    }
    public int maxSubarraySumCircular(int[] nums) {
        int max_normal=normalMax(nums);
        if(max_normal<0) return max_normal;
        int arr_sum=0;
        for(int i=0;i<nums.length;i++){
            arr_sum+=nums[i];
            nums[i]=-nums[i];
        }
        int max_circular=arr_sum+normalMax(nums);
        return Math.max(max_normal,max_circular);
    }
}
