class Solution {
    public int maximumDifference(int[] arr) {
        int n=arr.length,min=arr[0],res=-1;
        for(int j=1;j<n;j++){
            if(arr[j]>min)
            res=Math.max(res,arr[j]-min);
            min=Math.min(min,arr[j]);
        }
        return res;
    }
}