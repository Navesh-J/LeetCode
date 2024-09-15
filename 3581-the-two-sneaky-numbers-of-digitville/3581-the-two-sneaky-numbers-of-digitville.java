class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int arr[]=new int[100];
        for(int num:nums){
            arr[num]++;
        }
        int res[]=new int[2];
        int x=0;
        for(int i=0;i<100;i++){
            if(arr[i]==2)
            res[x++]=i;
        }
        return res;
    }
}