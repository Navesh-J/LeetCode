class Solution {
    public boolean judgeCircle(String moves) {
        int v=0,h=0;
        for(char ch:moves.toCharArray()){
            if(ch=='U') v++;
            else if(ch=='D') v--;
            else if(ch=='R') h++;
            else h--;
        }
        return v==0 && h==0;
    }
}