class Solution {
    public int maximizeSum(int[] nums, int k) {
        int sum=0,max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[max])
            max=i;
        }
        for(int i=0;i<k;i++){
            sum+=nums[max];
            nums[max]+=1;
        }
        return sum;
    }
}