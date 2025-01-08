class Solution {
    private boolean isPrefixAndSuffix(String str1, String str2){
        if(str2.startsWith(str1) && str2.endsWith(str1))
            return true;
        return false;
    }
    public int countPrefixSuffixPairs(String[] words) {
        int res=0;
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                if(i != j && isPrefixAndSuffix(words[i],words[j])){
                    res++;
                }
            }
        }
        return res;
    }
}