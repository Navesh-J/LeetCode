class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        for(int num:nums) set.add(num);
        int distinct = set.size();
        Map<Integer,Integer> map = new HashMap<>();
        int left = 0, count = 0;
        for(int right=0;right<n;right++){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);

            while(map.size() == distinct){
                count+=(n-right);
                map.put(nums[left],map.get(nums[left])-1);
                if(map.get(nums[left]) == 0)
                    map.remove(nums[left]);
                left++;
            }
        }
        return count;
    }
}