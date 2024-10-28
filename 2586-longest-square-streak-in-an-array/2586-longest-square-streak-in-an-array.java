class Solution {
    public int longestSquareStreak(int[] nums) {
        Set<Long> set=new HashSet<>();
        for(int num:nums)
            set.add((long)num);
        int max=0;
        for(long num:set){
            int count=0;
            long curr=num;
            while(set.contains(curr)){
                count++;
                curr*=curr;
            }
            max=Math.max(count,max);
        }
        if(max<2)
        return -1;
        return max;
    }
}