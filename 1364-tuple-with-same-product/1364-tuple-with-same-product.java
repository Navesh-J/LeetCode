class Solution {
    public int tupleSameProduct(int[] nums) {
        Map<Integer, Integer> productMap = new HashMap<>();
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int product = nums[i] * nums[j];
                if (productMap.containsKey(product)) {
                    result += productMap.get(product);
                }
                productMap.put(product, productMap.getOrDefault(product, 0) + 1);
            }
        }
        return result * 8;
    }
}