class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0,p=1;
        String s=Integer.toString(n);
        for(char ch:s.toCharArray()){
            sum+=Character.getNumericValue(ch);
            p*=Character.getNumericValue(ch);
        }
        return p-sum;
    }
}