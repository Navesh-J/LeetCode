class Solution {
    public int countPartitions(int[] nums) {
        int n=nums.length;
        int res=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        int curr_sum=0;
        for(int i=0;i<n-1;i++){
            curr_sum+=nums[i];
            sum-=nums[i];
            if((curr_sum-sum)%2==0)
                res++;
        }
        return res;
    }
}