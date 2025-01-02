class Solution {
    private boolean isVowel(char ch){
        String v="aeiou";
        if(v.indexOf(ch)==-1)
        return false;
        return true;
    }
    public int[] vowelStrings(String[] words, int[][] queries) {
        int arr[]=new int[words.length+1];
        arr[0]=0;
        for(int i=0;i<words.length;i++){
            String word=words[i];
            if( (isVowel(word.charAt(0))) && (isVowel(word.charAt(word.length()-1)))){
                arr[i+1]=arr[i]+1;
            }else{
                arr[i+1]=arr[i];
            }
        }
        int[] res=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int l=queries[i][0];
            int r=queries[i][1];
            res[i]=arr[r+1]-arr[l];
        }
        return res;
    }
}