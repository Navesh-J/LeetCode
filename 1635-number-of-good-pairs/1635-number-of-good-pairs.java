class Solution {
    public int numIdenticalPairs(int[] nums) {
        int arr[]=new int[101];
        int goodpairs=0;
        for(int i=0;i<nums.length;i++)
        arr[nums[i]]++;
        for(int i=1;i<101;i++){
            if(arr[i]>1){
                goodpairs+=(arr[i]*(arr[i]-1))/2;
            }
        }
        return goodpairs;
    }
}