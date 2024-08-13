class Solution {
    public int findPeakElement(int[] arr) {
        int x=0;
        for(int i=0;i<arr.length;i++)
        if(arr[x]<arr[i])
        x=i;
        return x;
    }
}