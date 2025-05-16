class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        final int mod = 1000000007;
        int len = n*(n+1)/2;
        int arr[]=new int[len];
        int index=0;
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=i;j<n;j++){
                sum = (sum+nums[j]) % mod;
                arr[index++] = sum;
            }
        }
        int res=0;
        Arrays.sort(arr);
        for(int i=left-1;i<right;i++){
            res = (res+arr[i]) % mod;
        }
        return res;
    }
}