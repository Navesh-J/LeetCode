class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        for(int num:nums){
            int l=Integer.toString(num).length();
            if(l%2==0)
            c++;
        }
        return c;
    }
}