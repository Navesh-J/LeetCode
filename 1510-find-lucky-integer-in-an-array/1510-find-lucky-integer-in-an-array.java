class Solution {
    public int findLucky(int[] arr) {
        int []count=new int[501];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        for(int i=count.length-1;i>0;i--){
            if(i==count[i])
            return i;
        }
        return -1;
    }
}