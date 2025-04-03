class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        int prevPetrol=0,currPetrol=0;
        int start=0;
        for(int i=0;i<n;i++){
            currPetrol+=(gas[i]-cost[i]);
            if(currPetrol<0){
                start=i+1;
                prevPetrol+=currPetrol;
                currPetrol=0;
            }
        }
        return (prevPetrol+currPetrol)>=0?start:-1;
    }
}