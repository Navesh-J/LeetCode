class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> master=new ArrayList<>();
        int n=nums.length;
        int powSize=1<<n;
        for(int counter=0;counter<powSize;counter++){
            List<Integer> list=new ArrayList<>();
            for(int j=0;j<n;j++){
                if((counter & (1<<j)) !=0)
                list.add(nums[j]);
            }
            master.add(list);
        }
        return master;
    }
}