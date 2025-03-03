class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int mid=0;
        int n=nums.length;
        int pivots=0;
        for(int num:nums){
            if(num<pivot){
                mid++;
            }else if(num==pivot)
                pivots++;
        }
        int x=0,y=mid;
        int arr[]=new int[n];
        while(pivots-->0)
            arr[y++]=pivot;
        for(int i=0;i<n;i++){
            if(nums[i]<pivot){
                arr[x++]=nums[i];
            }else if(nums[i]>pivot){
                arr[y++]=nums[i];
            }
            System.out.print(arr[i]+" ");
        }
        return arr;
    }
}