class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeroes, int numNegOnes, int k) {
        int sum=0;
        while(k>0 && numOnes>0){
            sum++;
            k--;
            numOnes--;
        }
        while(k>0 && numZeroes>0){
            k--;
            numZeroes--;
        }
        while(k>0 && numNegOnes>0){
            sum--;
            k--;
            numNegOnes--;
        }
        return sum;
    }
}