class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int cl=0,cr=0,cs=0;
        for(char ch:moves.toCharArray()){
            if(ch == 'L') cl++;
            else if(ch == 'R') cr++;
            else cs++;
        }
        return Math.abs(cl-cr) + cs;
    }
}