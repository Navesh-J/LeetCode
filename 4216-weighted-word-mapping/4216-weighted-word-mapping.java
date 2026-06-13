class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        char[] alphabets = new char[26];
        for (int index = 0; index < 26; index++) {
            alphabets[index] = (char) ('z' - index);
        }
        String res="";
        for(String word:words){
            int weight = 0;
            for(char ch:word.toCharArray()){
                weight+=weights[ch-'a'];
            }
            weight %= 26;
            res+=alphabets[weight];
        }
        return res;
    }
}