class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int res=1;
        for(int i=1;i<n;i++){
            if(nums[res-1]!=nums[i]){
                nums[res]=nums[i];
                res++;
            }
        }
        return res;
    }
}