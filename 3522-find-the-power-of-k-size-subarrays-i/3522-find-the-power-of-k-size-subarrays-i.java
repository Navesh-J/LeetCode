class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n=nums.length;
        int arr[]=new int[n-k+1];
        for(int i=0;i<n-k+1;i++){
            int power=nums[i];
            for(int j=i+1;j<i+k;j++){
                if(nums[j-1]>=nums[j] || ((nums[j]-nums[j-1]) !=  1)){
                    power=-1;
                    break;
                }
                else{
                    power=Math.max(power,nums[j]);
                }
            }
            arr[i]=power;
        }
        return arr;
    }
}
