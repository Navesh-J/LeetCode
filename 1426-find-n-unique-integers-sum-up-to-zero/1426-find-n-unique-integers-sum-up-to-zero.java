class Solution {
    public int[] sumZero(int n) {
        int edge=n/2;
        edge*=-1;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            if(n%2==0&&edge==0)
            edge++;
            arr[i]=edge++;
        }
        return arr;
    }
}