class Solution {
    public boolean checkIfExist(int[] arr) {
          int zeroCount = 0;
        for (int num : arr) {
            if (num == 0) {
                zeroCount++;
            }
        }
        if (zeroCount > 1) {
            return true;
        }
        for(int nums:arr){
            for(int nums2:arr){
                if(nums != nums2 &&  nums==2*nums2){
                    return true;
                }
            }
        }
        return false;
    }
}