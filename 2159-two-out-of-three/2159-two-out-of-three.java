class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        List<Integer> list3=new ArrayList<>();
        List<Integer> result=new ArrayList<>();
        Set<Integer> set=new HashSet<>();
        for(int num:nums1){
            list1.add(num);
            set.add(num);
        }
        for(int num:nums2){
            list2.add(num);
            set.add(num);
        }
        for(int num:nums3){
            list3.add(num);
            set.add(num);
        }
        for(int num:set){
            boolean a=list1.contains(num);
            boolean b=list2.contains(num);
            boolean c=list3.contains(num);
            if( (a&&b) || (b&&c) || (a&&c) )
            result.add(num);
        }
        return result;
    }
}