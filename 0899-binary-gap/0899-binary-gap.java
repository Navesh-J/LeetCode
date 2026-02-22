class Solution {
    public int binaryGap(int n) {
        String s = Integer.toBinaryString(n);
        int max = 0;
        int start = s.indexOf('1');
        int l = start, r = start;
        for (int i = start + 1; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '1') {
                r = i;
                max = Math.max(max, (r - l));
                l = r;
            }
        }
        if (r == start)
            return 0;
        return max;
    }
}