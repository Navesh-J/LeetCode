class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int arr[] = new int[n];
        k=k%n;
        if(k==0) return;
        for (int i = 0; i < n; i++) {
            int shift = i + k;
            if (shift > n - 1)
                shift = 0 + (shift - n);
            arr[shift] = nums[i];
        }
        for (int i = 0; i < n; i++)
            nums[i] = arr[i];
    }
}