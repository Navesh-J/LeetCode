class Solution {
    public int pivotIndex(int[] nums) {
        int total=0,lsum=0;
        for(int num:nums){
            total+=num;
        }
        for(int i=0;i<nums.length;i++){
            total-=nums[i];
            if(lsum == total) return i;
            lsum+=nums[i];
        }
        return -1;
    }
}