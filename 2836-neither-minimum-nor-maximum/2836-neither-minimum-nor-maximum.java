class Solution {
    public int findNonMinOrMax(int[] nums) {
        if(nums.length<3)
        return -1;
        int max=nums[0],min=nums[0];
        for(int num:nums){
            if(num>max)
            max=num;
            if(num<min)
            min=num;
        }
        for(int num:nums){
            if(num!=max && num!=min)
            return num;
        }
        return -1;
    }
}