class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int max=Arrays.stream(nums).max().orElse(Integer.MIN_VALUE);
        int min=Arrays.stream(nums).min().orElse(Integer.MAX_VALUE);
        while(k-->0){
            min++;
            max--;
            if(min>= max)
            return 0;
        }
        return max-min;
    }
}