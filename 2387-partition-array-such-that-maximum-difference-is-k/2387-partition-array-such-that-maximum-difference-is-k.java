class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int res=0,min=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]-min > k){
                res++;
                min = nums[i];
            }
        }
        return res+1;
    }
}