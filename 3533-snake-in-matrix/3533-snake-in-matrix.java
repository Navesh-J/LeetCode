class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int pos=0;
        for(String c:commands){
            if(c.equals("RIGHT"))
            pos+=1;
            else if(c.equals("LEFT"))
            pos-=1;
            else if(c.equals("DOWN"))
            pos+=n;
            else
            pos-=n;
        }
        return pos;
    }
}