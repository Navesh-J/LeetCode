class Solution {
    private boolean diffParity(int a,int b){
        if((a%2==0 && b%2!=0) || (a%2!=0&&b%2==0))
            return true;
        return false;
    }
    public boolean isArraySpecial(int[] nums) {
        for(int i=1;i<nums.length;i++){
            if(!diffParity(nums[i],nums[i-1]))
                return false;
        }
        return true;
    }
}