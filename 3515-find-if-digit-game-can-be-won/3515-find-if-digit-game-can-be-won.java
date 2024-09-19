class Solution {
    public boolean canAliceWin(int[] nums) {
        int ss=0,ds=0;
        for(int num:nums){
            if(num>9)
            ds+=num;
            else
            ss+=num;
        }
        if(ss==ds)
        return false;
        return true;
    }
}