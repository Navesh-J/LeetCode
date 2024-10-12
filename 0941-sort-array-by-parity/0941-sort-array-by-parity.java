class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int arr[]=new int[nums.length];
        int low=0,high=nums.length-1;
        for(int num:nums){
            if((num&1) == 0){
                arr[low++]=num;
            }
            else
            arr[high--]=num;
        }
        return arr;
    }
}