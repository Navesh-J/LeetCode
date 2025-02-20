class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int l=nums[0].length();
        Set<Integer> set=new HashSet<>();
        for(String num:nums){
            int n =Integer.parseInt(num,2);
            set.add(n);
        }
        for(int i=0;i<Math.pow(2,l);i++){
            if(!set.contains(i)){
                return String.format("%"+l+"s", Integer.toBinaryString(i)).replace(' ', '0');
            }
        }
        return "";
    }
}