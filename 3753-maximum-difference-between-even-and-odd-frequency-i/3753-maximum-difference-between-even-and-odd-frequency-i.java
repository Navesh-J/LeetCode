class Solution {
    public int maxDifference(String s) {
        int count[] = new int[26];
        int odd=1,even=102;
        for(char ch:s.toCharArray()){
            count[ch-'a']++;
        }
        for(int c:count){
            if(c%2!=0){
                odd = Math.max(odd,c);
            }else if(c%2==0 && c!=0){
                even = Math.min(even,c);
            }
        }
        return odd-even;
    }
}