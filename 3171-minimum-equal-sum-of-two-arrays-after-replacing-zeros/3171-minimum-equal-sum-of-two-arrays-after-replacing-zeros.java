class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        int c1=0,c2=0;
        long s1=0,s2=0;
        for(int num:nums1){
            if(num == 0)
                c1++;
            s1+=num;
        }
        for(int num:nums2){
            if(num == 0)
                c2++;
            s2+=num;
        }
        if((c1 == 0 && s1<(s2+c2)) || (c2 == 0 && s2<(s1+c1)))
            return -1;
        long res1 = s1+c1;
        long res2 = s2+c2;
        return Math.max(res1,res2);
    }
}