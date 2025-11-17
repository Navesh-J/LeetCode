class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int c1=0,c2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                c1=i;
                break;
            }
        }
        c2=c1;
        for(int i=c1+1;i<nums.length;i++){
            if(nums[i] == 1){
                c1=c2;
                c2=i;
                if((c2-c1-1) < k)
                    return false;
            }
        }
        return true;
    }
}