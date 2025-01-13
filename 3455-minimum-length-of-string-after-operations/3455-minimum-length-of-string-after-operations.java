class Solution {
    public int minimumLength(String s) {
        int count[]=new int[26];
        for(char ch:s.toCharArray()){
            int i=(int)ch - 'a';
            count[i]++;
        }
        int res=0;
        for(int n:count){
            if(n <= 2){
                res+=n;
            }
            else{
                if(n%2 == 0){
                    res+=2;
                }else{
                    res+=1;
                }
            }
        }
        return res;
    }
}