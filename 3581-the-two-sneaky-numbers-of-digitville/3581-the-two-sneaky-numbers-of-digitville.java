class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int j=0;
        int arr[] = new int[2];
        int count[] = new int[101];
        for(int num:nums){
            count[num]++;
            if(count[num] > 1){
                arr[j++] = num;
            }
        }
        return arr;
    }
}