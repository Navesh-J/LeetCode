class Solution {
    public int[] createTargetArray(int[] nums, int[] indexes) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int index=indexes[i];
            list.add(index,num);
        }
        int[] target=new int[list.size()];
        for(int i=0;i<list.size();i++){
            target[i]=list.get(i);
        }
        return target;
    }
}