class Solution {
    public int minimumDeletions(String word, int k) {
        int count[] = new int[26];
        for (char ch : word.toCharArray()) {
            count[ch - 'a']++;
        }
        int res = word.length();
        for (int a : count) {
            int del = 0;
            for (int b : count) {
                if (a > b) {
                    del += b;
                } else if (b > (a + k)) {
                    del += (b - a - k);
                }
            }
            res=Math.min(res,del);
        }
        return res;
    }
}