class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        Map<String, Integer> map = new HashMap<>();
        int n = dominoes.length;
        for (int i = 0; i < n; i++) {
            int a = dominoes[i][0];
            int b = dominoes[i][1];
            String key = a < b ? a + "," + b : b + "," + a;
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        int res = 0;
        for (int count : map.values()) {
            if (count > 1) {
                res += count * (count - 1) / 2;
            }
        }
        return res;
    }
}
