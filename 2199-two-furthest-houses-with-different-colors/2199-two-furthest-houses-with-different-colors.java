class Solution {
    public int maxDistance(int[] colors) {
        int leftMax = 0,rightMax = colors.length;
        for(int i=colors.length-1;i>=0;i--){
            if(colors[i] != colors[0]){
                leftMax = i;
                break;
            }
        }
        for(int i=0;i<colors.length;i++){
            if(colors[i] != colors[colors.length-1]){
                rightMax = colors.length-i-1;
                break;
            }
        }
        return Math.max(leftMax,rightMax);
    }
}