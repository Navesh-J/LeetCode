class Solution {
    public int minSwaps(String s) {
        int count=0,swap=0;
        for(char ch:s.toCharArray()){
            if(ch=='[')
            count++;
            else
            count--;
            if(count<0){
                swap++;
                count++;
            }
        }
        return (swap+1)/2;
    }
}