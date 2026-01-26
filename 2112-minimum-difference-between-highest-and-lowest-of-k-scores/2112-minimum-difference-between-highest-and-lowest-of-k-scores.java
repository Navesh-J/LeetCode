class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int end = nums.length-1;
        int start = end-k+1;
        int res=nums[end]-nums[start];
        while(start >= 0){
            int diff = nums[end]-nums[start];
            res = Math.min(res,diff);
            start--;
            end--;
        }
        return res;
    }
}