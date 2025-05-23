class Solution {
    public int[] sortArray(int[] nums) {
        buildHeap(nums);
        int n=nums.length;
        for(int i=n-1;i>=0;i--){
            int temp=nums[0];
            nums[0]=nums[i];
            nums[i]=temp;
            maxHeap(nums,i,0);
        }
        return nums;
    }
    private void maxHeap(int arr[],int n,int i){
        int largest=i;
        int left=2*i+1, right=2*i+2;
        if(left<n && arr[left]>arr[largest])
            largest=left;
        if(right<n && arr[right]>arr[largest])
            largest=right;
        if(largest != i){
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;
            maxHeap(arr,n,largest);
        }
    }

    private void buildHeap(int arr[]){
        int n=arr.length;
        for(int i=(n-2)/2;i>=0;i--){
            maxHeap(arr,n,i);
        }
    }

}