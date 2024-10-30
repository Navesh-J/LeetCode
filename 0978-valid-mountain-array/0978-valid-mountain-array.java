class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3) return false;
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[max]<arr[i])
            max=i;
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1])
            return false;
        }
        if(max==0 || max==arr.length-1)
        return false;
        boolean increasing=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[max])
            increasing=false;
            else if(increasing && arr[i]>arr[i+1])
            return false;
            else if(!increasing && arr[i]<arr[i+1])
            return false;
        }
        return true;
    }
}