class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int i=0,j=0;
        int n1=nums1.length,n2=nums2.length;
        int x=0;
        int n=Math.max(nums1[n1-1][0],nums2[n2-1][0]);
        int arr[][]=new int[n][2];
        while(i<n1 && j<n2){
            if(nums1[i][0]<nums2[j][0]){
                arr[x][0]=nums1[i][0];
                arr[x][1]=nums1[i][1];
                i++;
                x++;
            }
            else if(nums1[i][0]>nums2[j][0]){
                arr[x][0]=nums2[j][0];
                arr[x][1]=nums2[j][1];
                x++;
                j++;
            }
            else{
                arr[x][0]=nums1[i][0];
                arr[x][1]=nums1[i][1]+nums2[j][1];
                i++;
                j++;
                x++;
            }
        }
        while(i<n1){
            arr[x][0]=nums1[i][0];
            arr[x][1]=nums1[i][1];
            i++;
            x++;
        }
        while(j<n2){
            arr[x][0]=nums2[j][0];
            arr[x][1]=nums2[j][1];
            x++;
            j++;
        }
        arr = Arrays.copyOf(arr, x);
        return arr;
    }
}