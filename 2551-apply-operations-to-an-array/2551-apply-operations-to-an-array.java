class Solution {
    public int[] applyOperations(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        int zeroes=0,index=0;
        for(int i=0;i<n;i++){
            if(nums[i] == 0){
                zeroes++;
            }
            else if(i<n-1 && nums[i] == nums[i+1]){
                arr[index++]=nums[i+1]*2;
                i++;
                zeroes++;
            }else{
                arr[index++]=nums[i];
            }
        }
        while(zeroes-->0){
            arr[index++]=0;
        }
        return arr;
    }
}