class Solution {
    public int minimumSum(int[] nums) {
        int n=nums.length;
        int min=500;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[i]<nums[j] && nums[k]<nums[j]){
                        int sum=nums[i]+nums[j]+nums[k];
                        min=Math.min(min,sum);
                    }
                }
            }
        }
        return min==500?-1:min;
    }
}