class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (arr1.isEmpty() || arr2.isEmpty()) {
                if (arr1.isEmpty()) {
                    arr1.add(nums[i]);
                } else {
                    arr2.add(nums[i]);
                }
            } else {
                int last1 = arr1.get(arr1.size() - 1);
                int last2 = arr2.get(arr2.size() - 1);
                
                if (last1 > last2) {
                    arr1.add(nums[i]);
                } else {
                    arr2.add(nums[i]);
                }
            }
        }

        int[] res = new int[n];
        int index = 0;

        for (int num : arr1) {
            res[index++] = num;
        }
        for (int num : arr2) {
            res[index++] = num;
        }

        return res;
    }
}