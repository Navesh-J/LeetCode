class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int count[]=new int[1001];
        for(int num:nums1){
            count[num]++;
        }
        List<Integer> list=new ArrayList<>();
        for(int num:nums2){
            if(count[num] >0){
                list.add(num);
                count[num]--;
            }
        }
        int res[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
        return res;
    }
}