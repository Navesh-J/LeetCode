class Solution {
    public int minimumOperations(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for(int num:nums){
            list.add(num);
        }
        Set<Integer> set=new HashSet<>(list);
        if(set.size()==list.size())
        return 0;
        int res=0;
        while(set.size()!=list.size()){
            if(list.size()>=3){
                list.remove(0);list.remove(0);list.remove(0);
                set=new HashSet<>(list);
                res++;
            }else{
                res+=1;
                break;
            }
        }
        return res;
    }
}