class Solution {
    private boolean flick(boolean flag){
        if(flag==true)
        return false;
        return true;
    }
    public int countAsterisks(String s) {
        boolean flag=false;
        int c=0;
        for(char ch:s.toCharArray()){
            if(ch=='|')
                flag = flick(flag);
            if(!flag && ch=='*')
                c++;
        }
        return c;
    }
}