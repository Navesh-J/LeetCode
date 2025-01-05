class Solution {
    private char shiftChar(char ch, int shift) {
        int newChar = (ch - 'a' + shift) % 26;
        if (newChar < 0) newChar += 26;
        return (char) ('a' + newChar);
    }

    public String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        int[] shiftArr = new int[n + 1];
        
        for (int[] shift : shifts) {
            int start = shift[0];
            int end = shift[1];
            int direction = shift[2];
            int value = direction == 1 ? 1 : -1;
            
            shiftArr[start] += value;
            if (end + 1 < n) {
                shiftArr[end + 1] -= value;
            }
        }
        
        char[] arr = s.toCharArray();
        int cumulativeShift = 0;
        for (int i = 0; i < n; i++) {
            cumulativeShift += shiftArr[i]; 
            arr[i] = shiftChar(arr[i], cumulativeShift);
        }

        return new String(arr);
    }
}
