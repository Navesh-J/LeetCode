class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int res=0;
        for(int i=1;i<points.length;i++){
            int x2=points[i][0];
            int y2=points[i][1];
            int x1=points[i-1][0];
            int y1=points[i-1][1];
            res+=Math.max(Math.abs(y2-y1),Math.abs(x2-x1));
        }
        return res;
    }
}