class Solution {
    public long countBadPairs(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        long total=(long)n*(n-1)/2;
        for(int i=0;i<n;i++){
            int key=nums[i]-i;
            map.put(key,map.getOrDefault(key,0)+1);
        }
        long goodPairs=0;
        for(int count:map.values()){
            if(count > 1){
                goodPairs += (long) count * (count - 1) / 2;  
            }
        }
        return total-goodPairs;
    }
}