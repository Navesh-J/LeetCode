class Solution {
    public int longestSubarray(int[] nums) {
        int max=0;
        for(int num:nums){
            max=Math.max(max,num);
        }
        int res=0,count=0;
        for(int num:nums){
            if(num == max){
                count++;
            }
            else{
                count=0;
            }
            res=Math.max(res,count);
        }
        return res;
    }
}