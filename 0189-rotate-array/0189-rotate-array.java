class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        //left rotating the array by n-k times
        k=k%n;
        if(k==0) return;
        k=n-k;
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        reverse(nums,0,n-1);
    }
    private void reverse(int[] nums,int low,int high){
        while(low<high){
            int temp=nums[low];
            nums[low]=nums[high];
            nums[high]=temp;
            low++;
            high--;
        }
    }
}