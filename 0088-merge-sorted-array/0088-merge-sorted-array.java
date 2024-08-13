class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int a=0,b=0;
        while(m<nums1.length){
            nums1[m++]=nums2[b++];
        }
        Arrays.sort(nums1);
    }
}