class Solution {
    public int[] rearrangeArray(int[] nums) {
        int even = 0,odd = 1;
        int arr[] = new int[nums.length];
        for(int num:nums){
            if(num>0){
                arr[even] = num;
                even+=2;
            }else{
                arr[odd] = num;
                odd+=2;
            }
        }
        return arr;
    }
}