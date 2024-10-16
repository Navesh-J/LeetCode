class Solution {
    public int maxProfit(int[] arr) {
        int min=arr[0],profit=0;
        for(int i=1;i<arr.length;i++){
            int cost=arr[i]-min;
            profit=Math.max(profit,cost);
            min=Math.min(min,arr[i]);
        }
        return profit;
    }
}