class Solution {
    public boolean isPalindrome(int n) {
        int temp=n,r=0;
        while (n>0)
        {
            int d=n%10;
            r=r*10+d;
            n/=10;
        }
        if(temp==r)
        return true;
        else
        return false;
    }
}