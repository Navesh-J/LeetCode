class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int total = 0;
        for(int app:apple)
            total+=app;
        Arrays.sort(capacity);
        int res=0;
        for(int i=capacity.length-1;i>=0;i--){
            int cap = capacity[i];
            total-=cap;
            res++;
            if(total<=0) break;
        }
        return res;
    }
}