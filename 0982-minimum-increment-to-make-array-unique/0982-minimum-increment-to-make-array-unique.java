class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int res=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=nums[i-1]){
                int toAdd=nums[i-1]-nums[i]+1;
                nums[i]+=toAdd;
                res+=toAdd;
            }
        }
        return res;
    }
}