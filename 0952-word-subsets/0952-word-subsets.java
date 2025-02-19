class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> list=new ArrayList<>();
        int count[]=new int[26];
        for(String word:words2){
            int fakeCount[]=new int[26];
            for(char ch:word.toCharArray()){
                fakeCount[ch-'a']++;
                count[ch-'a'] = Math.max(fakeCount[ch-'a'],count[ch-'a']);
            }
        }
        for(String word:words1){
            int tempCount[]=new int[26];
            for(char ch:word.toCharArray()){
                tempCount[ch-'a']++;
            }
            boolean flag=true;
            for(int i=0;i<26;i++){
                if(count[i] > tempCount[i]){
                    flag=false;
                    break;
                }
            }
            if(flag){
                list.add(word);
            }
        }
        return list;
    }
}