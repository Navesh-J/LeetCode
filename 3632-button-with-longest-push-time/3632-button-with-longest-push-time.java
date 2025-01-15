class Solution {
    public int buttonWithLongestTime(int[][] events) {
        int n=events.length;
        for (int i = n - 1; i > 0; i--) {
            events[i][1] = events[i][1] - events[i - 1][1];
        }
        int max = events[0][1];
        int res = events[0][0];
        for(int i=1;i<n;i++){
            int a=events[i][0];
            int b=events[i][1];
            if(max < b || (b == max && a < res)){
                res = a;
                max = b;
            }
        }
        return res;
    }
}