class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows)
            return s;
        int c = s.length();
        int r = numRows;
        char arr[][] = new char[r][c];
        int x = 0;
        boolean flag = false;
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                if (x >= c) {
                    flag = true;
                    break;
                }
                arr[j][i] = s.charAt(x++);
            }
            if (flag)
                break;
            int cot = r - 2;
            while (cot > 0) {
                i++;
                if (x >= c) {
                    flag = true;
                    break;
                }
                arr[cot][i] = s.charAt(x++);
                cot --;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (arr[i][j] != 0) {
                    sb.append(arr[i][j]);
                }
            }
        }
        return sb.toString();
    }
}