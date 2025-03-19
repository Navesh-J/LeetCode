class Solution {
    private int flip(int num){
        return num == 1?0:1;
    }
    public int minOperations(int[] nums) {
        int res=0;
        for(int i=0;i<nums.length-2;i++){
            if(nums[i] == 0){
                nums[i]   = flip(nums[i]);
                nums[i+1] = flip(nums[i+1]);
                nums[i+2] = flip(nums[i+2]);
                res++;
            }
        }
        if(nums[nums.length-1] == 0 || nums[nums.length-2] == 0)
            return -1;
        return res;
    }
}