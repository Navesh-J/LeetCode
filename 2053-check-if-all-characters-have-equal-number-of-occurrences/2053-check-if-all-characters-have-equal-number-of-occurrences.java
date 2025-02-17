class Solution {
    public boolean areOccurrencesEqual(String s) {
        int count[]=new int[26];
        for(char ch:s.toCharArray()){
            count[ch-'a']++;
        }
        int flag=Arrays.stream(count).max().getAsInt();
        for(int c:count){
            if(c != flag && c!=0)
                return false;
        }
        return true;
    }
}