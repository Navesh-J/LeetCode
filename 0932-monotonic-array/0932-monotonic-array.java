class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean increasing=true,decreasing=true;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1])
            increasing=false;
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1])
            decreasing=false;
        }
        if(increasing==false && decreasing==false)
        return false;
        return true;
    }
}