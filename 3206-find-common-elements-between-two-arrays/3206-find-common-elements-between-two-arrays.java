class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int ans[]=new int[2];
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        for(int num:nums1){
            list1.add(num);
        }
        for(int num:nums2){
            list2.add(num);
        }
        for(int num:nums1){
            if(list2.contains(num))
            ans[0]++;
        }
        for(int num:nums2){
            if(list1.contains(num))
            ans[1]++;
        }
        return ans;
    }
}