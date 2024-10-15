class Solution {
    public int trap(int[] arr) {
        int res=0,n=arr.length;
        int lmax[]=new int[n];
        int rmax[]=new int[n];
        lmax[0]=arr[0];
        rmax[n-1]=arr[n-1];
        for(int i=1;i<n;i++)
        lmax[i]=Math.max(arr[i],lmax[i-1]);
        for(int i=n-2;i>=0;i--)
        rmax[i]=Math.max(arr[i],rmax[i+1]);
        for(int i=1;i<n;i++){
            res+=Math.min(lmax[i],rmax[i])-arr[i];
        }
        return res;
    }
}