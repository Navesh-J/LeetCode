class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set=new TreeSet<>();
        for(int num:nums)
            set.add(num);
        List<Integer> list=new ArrayList<>(set);
        if(list.size()<3)
            return list.get(list.size()-1);
        int index=list.size()-3;
        return list.get(index);
    }
}