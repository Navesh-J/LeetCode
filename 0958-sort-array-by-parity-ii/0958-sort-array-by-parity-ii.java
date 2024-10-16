class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n=nums.length;
        int even[]=new int[n/2];
        int odd[]=new int[n/2];
        int a=0,b=0;
        for(int i=0;i<n;){
            if(nums[i]%2==0)
            even[a++]=nums[i++];
            else
            odd[b++]=nums[i++];
        }
        a=0;b=0;
        for(int i=0;i<n;){
            nums[i++]=even[a++];
            nums[i++]=odd[b++];
        }
        return nums;
    }
}