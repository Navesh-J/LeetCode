class Solution {
    public int rearrangeCharacters(String s, String target) {
        int countS[]=new int[26];
        int countT[]=new int[26];
        for(char ch:s.toCharArray()){
            int index=ch-'a';
            countS[index]++;
        }
        for(char ch:target.toCharArray()){
            int index=ch-'a';
            countT[index]++;
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<26;i++){
            if(countT[i]>0){
                int poss=(int)(countS[i]/countT[i]);
                min=Math.min(min,poss);
            }
        }
        return min;
    }
}