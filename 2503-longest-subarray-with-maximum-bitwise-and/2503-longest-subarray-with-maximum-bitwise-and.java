class Solution {
    public int longestSubarray(int[] nums) {
        int max=0,count=0,streak=0;
        for(int num:nums){
            if(num>max){
                max=num;
            }
        }
        for(int num:nums){
            if(num==max)
            count++;
            if(num!=max){
                count=0;
            }
            streak=Math.max(count,streak);
        }
        return streak;
    }
}