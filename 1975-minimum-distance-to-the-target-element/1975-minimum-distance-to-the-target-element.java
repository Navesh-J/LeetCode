class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int min = 10001;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                int current = Math.abs(i - start);
                min = Math.min(min, current);
            }
        }
        return min;
    }
}