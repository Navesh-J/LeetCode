class Solution {
    private int reverse(int n){
        StringBuilder sb=new StringBuilder(Integer.toString(n));
        sb.reverse();
        return Integer.parseInt(sb.toString());
    }
    public boolean isSameAfterReversals(int num) {
        int temp=num;
        int rev=reverse(reverse(num));
        return rev==temp;
    }
}