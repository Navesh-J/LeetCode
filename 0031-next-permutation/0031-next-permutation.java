class Solution {
    public void nextPermutation(int[] nums) {
        int idx1 = -1, idx2 = -1;
        int n = nums.length;
        for (int i = n - 1; i > 0; i--) {
            if (nums[i - 1] < nums[i]){
                idx1 = i - 1;
                break;
            }
        }
        if (idx1 != -1) {
            for (int i = n - 1; i >= 0; i--) {
                if (nums[i] > nums[idx1]){
                    idx2 = i;
                    break;
                }
            }
            swap(nums, idx1, idx2);
        }
        int l = idx1 + 1, h = n - 1;
        while (l < h) {
            swap(nums, l, h);
            l++;
            h--;
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}