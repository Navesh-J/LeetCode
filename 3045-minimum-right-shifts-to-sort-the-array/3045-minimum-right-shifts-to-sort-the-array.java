class Solution {
    private List<Integer> shift(List<Integer> list){
        int temp=list.get(list.size()-1);
        for(int i=list.size()-1;i>0;i-- )
        list.set(i,list.get(i-1));
        list.set(0,temp);
        return list;
    }
    public int minimumRightShifts(List<Integer> nums) {
        List<Integer> list=new ArrayList<>(nums);
        Collections.sort(list);
        int count=0;
        while(!list.equals(nums)){
            shift(nums);
            count++;
            if(count>=nums.size())
            return -1;
        }
        return count;
    }
}