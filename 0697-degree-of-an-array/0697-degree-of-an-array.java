class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer,Integer> left = new HashMap(),right=new HashMap(),count=new HashMap();
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(left.get(num) == null)
                left.put(num,i);
            right.put(num,i);
            count.put(num,count.getOrDefault(num,0)+1);
        }
        int res=nums.length;
        int degree=Collections.max(count.values());
        for(int key:count.keySet()){
            if(count.get(key) == degree){
                res=Math.min(res,right.get(key)-left.get(key)+1);
            }
        }
        return res;
    }
}