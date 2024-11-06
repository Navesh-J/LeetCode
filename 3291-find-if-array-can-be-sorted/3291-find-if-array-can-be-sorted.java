class Solution {
    public boolean canSortArray(int[] nums) {
        int arr[] = nums.clone();
        Arrays.sort(arr);
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < nums.length - 1; i++) {
                boolean isSwappable = false;
                int n1 = nums[i];
                int n2 = nums[i + 1];
                if ((Integer.bitCount(n1) == Integer.bitCount(n2)) && n1 > n2) {
                    nums[i + 1] = n1;
                    nums[i] = n2;
                    swapped = true;
                }
            }
        } while (swapped);
        return Arrays.equals(arr, nums);
    }
}