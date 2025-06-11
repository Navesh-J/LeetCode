class Solution {
    public int[] shuffle(int[] nums, int n) {
        int x=0,y=n;
        int arr[]=new int[2*n];
        for(int i=0;i<2*n;){
            arr[i++]=nums[x++];
            arr[i++]=nums[y++];
        }
        return arr;
    }
}