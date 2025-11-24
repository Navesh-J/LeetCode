class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        int res=0;
        List<Boolean> list = new ArrayList<>();
        for(int num:nums){
            res = (res*2+num)%5;
            list.add(res==0);
        }
        return list;
    }
}