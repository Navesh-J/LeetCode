class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            if(map.containsKey(num))
            map.put(num,map.get(num)+1);
            else
            map.put(num,1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int val=nums.length/3;
            if(entry.getValue()>val)
            list.add(entry.getKey());
        }
        return list;
    }
}