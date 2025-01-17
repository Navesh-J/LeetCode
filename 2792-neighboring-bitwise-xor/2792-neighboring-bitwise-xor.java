class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int sum = derived[0];
        for(int i=1;i<derived.length;i++){
            sum ^= derived[i];
        }
        if(sum == 0) return true;
        return false;
    }
}