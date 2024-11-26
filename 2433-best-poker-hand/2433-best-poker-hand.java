class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        char s=suits[0];
        if(suits[0]==s && suits[1]==s && suits[2]==s && suits[3]==s && suits[4]==s)
        return "Flush";
        int arr[]=new int[14];
        for(int rank:ranks){
            arr[rank]++;
        }
        int max=0;
        for(int a:arr)  max=Math.max(max,a);
        if(max>=3) return "Three of a Kind";
        if(max==2) return "Pair";
        return "High Card";
    }
}