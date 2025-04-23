import java.util.HashMap;
class Solution {
    public int countLargestGroup(int n) {
        int arr[]=new int[40];
        int max = 0;
        for (int i = 1; i <= n; i++) {
            int sum = sod(i);
            arr[sum]++;
            max = Math.max(max, arr[sum]);
        } 
        int res = 0;
        for (int val : arr) {
            if (val == max) res++;
        }  
        return res;
    }

    private int sod(int n) {
        int sum = 0;
        while (n > 0) {
            sum += (n % 10);
            n /= 10;
        }
        return sum;
    }
}
