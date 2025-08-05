class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n=fruits.length;
        int ans=fruits.length;
        for(int fruit:fruits){
            for(int j=0;j<n;){
                if(baskets[j] >= fruit){
                    baskets[j]=-1;
                    ans-=1;;
                    j=0;
                    break;
                }else{
                    j++;
                }
            }
        }
        return ans;
    }
}