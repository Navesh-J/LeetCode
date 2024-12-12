class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
            set.add(reverse(num));
        }
        return set.size();
    }
    private int reverse(int num){
        StringBuilder sb=new StringBuilder(Integer.toString(num));
        num=Integer.parseInt(sb.reverse().toString());
        return num;
    }
}