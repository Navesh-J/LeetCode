class Solution {
    public int findLHS(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int max=0;
        for(int num:nums){
            int count=0;
            if(map.containsKey(num+1)){
                count+=map.get(num+1)+map.get(num);;
            }
            max=Math.max(max,count);
        }
        return max;
    }
}