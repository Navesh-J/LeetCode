class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a,b)->(b[1]-a[1]));
        int res=0;
        for(int box[]:boxTypes){
            int boxes=box[0];
            int units=box[1];
            if(truckSize == 0){
                break;
            }
            int boxesToLoad = Math.min(boxes, truckSize);
            res += boxesToLoad * units;
            truckSize -= boxesToLoad;
        }
        return res;
    }
}