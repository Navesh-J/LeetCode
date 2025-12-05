class Solution {
    public int countPartitions(int[] nums) {
        int sum=0;
        for(int num:nums) sum+=num;
        int res=0,lsum=0;
        for(int i=0;i<nums.length-1;i++){
            int num = nums[i];
            sum-=num;
            lsum+=num;
            if((lsum-sum)%2==0)
                res++;
        }
        return res;
    }
}