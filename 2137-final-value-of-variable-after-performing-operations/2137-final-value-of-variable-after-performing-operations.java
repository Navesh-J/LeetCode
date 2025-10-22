class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int res=0;
        for(String s:operations){
            res = evaluate(s,res);
        }
        return res;
    }
    private int evaluate(String str,int n){
        if(str.contains("++"))
            return n+1;
        return n-1;
    }
}