class Solution {
    public int largestCombination(int[] candidates) {
        int arr[]=new int[24];
        for(int num:candidates){
            for(int i=23;i>=0;i--){
                arr[i]+=num&1;
                num=num>>1;
            }
        }
        int max=0;
        for(int a:arr){
            max=Math.max(a,max);
        }
        return max;
    }
}