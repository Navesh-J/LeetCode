class Solution {
    public int maxOperations(int[] nums) {
        int sum=nums[0]+nums[1];
        int c=0;
        for(int i=0;i<nums.length-1;i+=2){
            int s=nums[i]+nums[i+1];
            if(s==sum)
            c++;
            else
            break;
        }
        return c;
    }
}