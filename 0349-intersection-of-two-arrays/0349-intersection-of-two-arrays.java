class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        Set<Integer> set=new HashSet<>();
        for(int num:nums1){
            set1.add(num);
        }
        for(int num:nums2){
            set2.add(num);
        }
        for(int num:set1){
            if(set2.contains(num))
                set.add(num);
        }
        int arr[]=new int[set.size()];
        int i=0;
        for(int num:set){
            arr[i++]=num;
        }
        return arr;
    }
}