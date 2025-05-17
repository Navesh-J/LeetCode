class Solution {
    public void sortColors(int[] nums) {
        int index[]=new int[3];
        for(int i=0;i<nums.length;i++){
            index[nums[i]]+=1;
        }
        int n=nums.length,x=0;
        for(int i=0;i<index[0];i++)
        nums[x++]=0;
        for(int i=0;i<index[1];i++)
        nums[x++]=1;
        for(int i=0;i<index[2];i++)
        nums[x++]=2;
    }
}