class Solution {
    public boolean digitCount(String num) {
        int count[]=new int[10];
        for(char ch:num.toCharArray()){
            int i=ch-'0';
            count[i]++;
        }
        boolean res=true;
        for(int i=0;i<num.length();i++){
            if(count[i] != (num.charAt(i)-'0'))
            res=false;
        }
        return res;
    }
}