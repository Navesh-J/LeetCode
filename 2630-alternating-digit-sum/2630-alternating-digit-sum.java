class Solution {
    private boolean isEvenLength(int n){
        int len=Integer.toString(n).length();
        return len%2==0;
    }
    public int alternateDigitSum(int n) {
        char op='+';
        if(isEvenLength(n))
        op='-';
        int sum=0;
        while(n>0){
            int d=n%10;
            if(op=='+'){
                sum+=d;
                op='-';
            }
            else if(op=='-'){
                sum-=d;
                op='+';
            }
            n/=10;
        }
        return sum;
    }
}