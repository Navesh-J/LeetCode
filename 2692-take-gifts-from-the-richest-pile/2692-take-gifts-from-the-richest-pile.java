class Solution {
    public long pickGifts(int[] gifts, int k) {
        long res=0;
        while(k-->0){
            int max=max(gifts);
            int num=gifts[max];
            num=(int)Math.floor(Math.sqrt(num));
            gifts[max]=num;
        }
        for(int gift:gifts){
            res+=gift;
        }
        return res;
    }
    private int max(int[] gifts){
        int max=0;
        for(int i=0;i<gifts.length;i++){
            if(gifts[i]>gifts[max]){
                max=i;
            }
        }
        return max;
    }
}