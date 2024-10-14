class Solution {
    // private void reverse(int[] arr){
    //     int low=0,high=arr.length-1;
    //     while(low<=high){
    //         int temp=arr[low];
    //         arr[low]=arr[high];
    //         arr[high]=temp;
    //     }
    // }
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        int max=-1;
        for(int i=n-1;i>=0;i--){
            int temp=arr[i];
            arr[i]=max;
            max=Math.max(max,temp);
        }
        return arr;
    }
}