class Solution {
    private int operation(String op){
        if(op.equals("--X") || op.equals("X--"))
        return -1;
        return 1;
    }
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(String op:operations){
            x+=operation(op);
        }
        return x;
    }
}