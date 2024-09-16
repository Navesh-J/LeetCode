class Solution {
    public int findMinDifference(List<String> timePoints) {
        int n=timePoints.size();
        int arr[]=new int[n];
        int i=0;
        for(String s:timePoints){
            String hours=s.substring(0,2);
            int hh=Integer.parseInt(hours) * 60;
            String minutes=s.substring(3);
            int mm=Integer.parseInt(minutes);
            int time=hh+mm;
            arr[i++]=time;
        }
        Arrays.sort(arr);
        int minDiff=Integer.MAX_VALUE;
        for(i=0;i<n-1;i++){
            int diff=Math.abs(arr[i]-arr[i+1]);
            minDiff=Math.min(minDiff,diff);
        }
        minDiff = Math.min(minDiff, 1440 - arr[n - 1] + arr[0]);
        return minDiff;
    }
}