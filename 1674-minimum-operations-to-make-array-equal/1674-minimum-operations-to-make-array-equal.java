class Solution {
    public int minOperations(int n) {
        int sum=0;
        int mid=n/2;
        for(int i=1;i<=((2*(n-1))+1);i+=2){
            sum+=i;
        }
        int res=0,avg=sum/n;
        for(int i=1;i<=((2*mid));i+=2){
            res+=avg-i;
        }
        return res;
    }
}