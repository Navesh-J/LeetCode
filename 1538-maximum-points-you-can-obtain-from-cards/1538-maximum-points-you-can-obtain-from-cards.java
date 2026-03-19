class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int totalSum=0;
        for(int cp:cardPoints)
            totalSum+=cp;
        int currSum = 0,minSum = 0;
        int n = cardPoints.length;
        k = n-k;
        for(int i=0;i<k;i++){
            minSum+=cardPoints[i];
        }
        currSum = minSum;
        for(int i=k;i<n;i++){
            currSum += (cardPoints[i] - cardPoints[i-k]);
            minSum = Math.min(currSum,minSum);
        }
        return totalSum - minSum;
    }
}