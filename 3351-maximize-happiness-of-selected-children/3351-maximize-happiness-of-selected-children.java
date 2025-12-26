class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        int turn = 0;
        Arrays.sort(happiness);
        int i = happiness.length-1;
        long res=0;
        while(k-- > 0){
            res += ((happiness[i]-turn > 0)?(happiness[i]-turn):0);
            i--;
            turn++;
        }
        return res;
    }
}