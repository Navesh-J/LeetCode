class Solution {
    public boolean findSubarrays(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length-1;i++){
            int s=nums[i]+nums[i+1];
            if(set.contains(s))
            return true;
            else
            set.add(s);
        }
        return false;
    }
}