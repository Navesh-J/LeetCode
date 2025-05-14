class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()) return false;
        int count1[]=new int[27];
        int count2[]=new int[27];
        for(char ch:word1.toCharArray()){
            int index = (int)ch-97;
            count1[index]++;
        }
        for(char ch:word2.toCharArray()){
            int index = (int)ch-97;
            count2[index]++;
        }
        for (int i = 0; i < 26; i++) {
            if ((count1[i] == 0 && count2[i] != 0) || (count1[i] != 0 && count2[i] == 0))
                return false;
        }
        Arrays.sort(count1);
        Arrays.sort(count2);
        return Arrays.equals(count1,count2);
    }
}