class Solution {
    public int minimumCost(int[] nums) {
        int sum=nums[0];
        int min = 100;
        int smin=min;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<min){
                smin=min;
                min=nums[i];
            }
            else if(nums[i]<smin && nums[i]>=min){
                smin=nums[i];
            }
        }
        return sum+min+smin;
    }
}