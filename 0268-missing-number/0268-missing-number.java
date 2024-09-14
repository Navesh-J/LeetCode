class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int res=0;
        for(int i=0;i<n+1;i++){
            res^=i;
        }
        for(int num:nums){
            res^=num;
        }
        return res;
    }
}