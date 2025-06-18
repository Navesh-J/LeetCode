class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int[][] ans = new int[n/3][3];
        for(int i = 0; i < n; i += 3) {
            int[] arr = new int[3];
            for(int j = i; j < i + 3; ++j) arr[j-i] = nums[j];
            if(arr[2]-arr[0] > k) return new int[0][0];
            ans[i/3] = arr;
        }
        return ans;
    }
}