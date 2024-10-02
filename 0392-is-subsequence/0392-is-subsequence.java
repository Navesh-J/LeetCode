class Solution {
    public boolean isSubsequence(String s, String t) {
        int a = 0, b = 0;
        if (t.length() < s.length())
            return false;
        if(s.isEmpty())
            return true;
        while (b < t.length()) {
            if (s.charAt(a) == t.charAt(b)) {
                a++;

            }
            b++;
            if (a >= s.length())
                return true;
        }
        return false;
    }
}