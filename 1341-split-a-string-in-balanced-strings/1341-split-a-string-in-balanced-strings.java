class Solution {
    public int balancedStringSplit(String s) {
        int count=0;
        int l=0;
        for(char ch:s.toCharArray()){
            if(ch=='L')
            l++;
            else
            l--;
            if(l==0)
            count++;
        }
        return count;
    }
}