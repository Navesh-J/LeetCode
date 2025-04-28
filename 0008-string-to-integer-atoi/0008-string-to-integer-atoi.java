class Solution {
    public int myAtoi(String s) {
        if(s.length() == 0) return 0;
        s = s.trim();
        char sign = ' ';
        int start = 0;
        if ((start < s.length()) && (s.charAt(start) == '+' || s.charAt(start) == '-')) {
            sign = s.charAt(start);
            start++;
        }
        if (start == s.length()) {
            return 0;
        }
        while (start < s.length() && s.charAt(start) == '0') {
            start++;
        }
        StringBuilder sb = new StringBuilder();
        while (start < s.length() && Character.isDigit(s.charAt(start))) {
            sb.append(s.charAt(start));
            start++;
        }
        if (sb.length() == 0)
            return 0;
        if (sign != ' ') {
            sb.insert(0, sign);
        }
        try {
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException e) {
            if (sign == '-') {
                return Integer.MIN_VALUE;
            } else {
                return Integer.MAX_VALUE;
            }
        }
    }
}