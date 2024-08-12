class Solution {
    public int[] numberOfPairs(int[] nums) {
        int count[]=new int[101];
        int pairs=0,leftovers=0;
        for(int i=0;i<nums.length;i++)
        count[nums[i]]++;
        for(int i=0;i<count.length;i++){
            pairs+=(int)count[i]/2;
            leftovers+=count[i]%2;
        }
        return new int[]{pairs,leftovers};
    }
}