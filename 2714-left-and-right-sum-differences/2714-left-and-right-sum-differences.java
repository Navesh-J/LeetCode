class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int lsum[]=new int[n];
        int rsum[]=new int[n];
        int answer[]=new int[n];
        lsum[0] = 0; rsum[n-1] = 0;
        for(int i = 1; i < n;i++){
            lsum[i] = lsum[i-1] + nums[i-1];
        }
        for(int i=n-1;i>0;i--){
            rsum[i-1] = rsum[i] + nums[i];
        }
        for(int i=0;i<n;i++){
            answer[i] = Math.abs(lsum[i] - rsum[i]);
        }
        return answer;
    }
}