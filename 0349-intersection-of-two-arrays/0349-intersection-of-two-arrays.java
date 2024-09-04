class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int count1[]=new int[1001];
        int count2[]=new int[1001];
        for(int num:nums1){
            count1[num]++;
        }
        for(int num:nums2){
            count2[num]++;
        }
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<1001;i++){
            if(count1[i]>0&&count2[i]>0)
            list.add(i);
        }
        int arr[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}