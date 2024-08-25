class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list=new ArrayList<>();
        int index=0;
        String find=Character.toString(x);
        for(String word:words){
            if(word.contains(find))
            list.add(index);
            index++;
        }
        return list;
    }
}