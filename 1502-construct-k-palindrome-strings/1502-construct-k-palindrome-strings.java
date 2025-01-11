class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length() < k) return false;
        int count[]=new int[26];
        for(char ch:s.toCharArray()){
            int index = ch - 'a';
            count[index]++;
        }
        int oc=0;
        for(int i:count){
            if(i%2 != 0)
                oc++;
        }
        if(oc > k)
            return false;
        return true;
    }
}