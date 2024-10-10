class Solution {
    public int minCostToMoveChips(int[] position) {
        int coste=0,costo=0;
        int evenNo=0,oddNo=0;
        for(int i=0;i<position.length;i++){
            if(position[i]%2==0){
                evenNo=i;
                break;
            }
        }
        for(int i=0;i<position.length;i++){
            if(position[i]%2!=0){
                oddNo=i;
                break;
            }
        }
        for(int i=0;i<position.length;i++){
            if(Math.abs((position[i]-position[evenNo]))%2!=0)
            coste++;
        }
        for(int i=0;i<position.length;i++){
            if(Math.abs((position[i]-position[oddNo]))%2!=0)
            costo++;
        }
        return Math.min(coste,costo);
    }
}