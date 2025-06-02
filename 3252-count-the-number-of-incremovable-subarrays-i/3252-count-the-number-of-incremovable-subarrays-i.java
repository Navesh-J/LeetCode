class Solution {
    public int incremovableSubarrayCount(int[] nums) {
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if (isStrictlyIncreasing(nums, i, j))
                    count++;
            }
        }
        return count;
    }
    private boolean isStrictlyIncreasing(int[] nums, int start, int end) {
        int prev = -1;
        for (int i = 0; i < nums.length; i++) {
            if (i >= start && i <= end) continue;
            if (prev != -1 && nums[i] <= prev) return false;
            prev = nums[i];
        }
        return true;
    }
}