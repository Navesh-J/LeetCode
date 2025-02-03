class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n=nums.length;
        int max1=1;
        int max2=1;
        int count1=1;
        int count2=1;
        for(int i=0;i<n-1;i++){
            if(nums[i]<nums[i+1]){
                count1++;
            }else{
                count1=1;
            }
            if(nums[i]>nums[i+1]){
                count2++;
            }else{
                count2=1;
            }
            max1=Math.max(max1,count1);
            max2=Math.max(max2,count2);
        }
        return Math.max(max1,max2);
    }
}