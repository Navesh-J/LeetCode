class Solution {
    public int[] sortedSquares(int[] nums) {
        int l=0,r=nums.length-1,pos=nums.length-1;
        int res[]=new int[nums.length];
        while(l<=r){
            int ls=nums[l]*nums[l];
            int rs=nums[r]*nums[r];
            if(ls>rs){
                res[pos]=ls;
                l++;
            }
            else{
                res[pos]=rs;
                r--;
            }
            pos--;
        }
        return res;
    }
}