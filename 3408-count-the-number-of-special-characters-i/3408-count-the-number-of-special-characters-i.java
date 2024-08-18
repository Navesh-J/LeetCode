class Solution {
    public int numberOfSpecialChars(String word) {
        int c=0;
        List<Character> list=new ArrayList<>();
        for(char ch:word.toCharArray()){
            list.add(ch);
        }
        for(char ch='a';ch<='z';ch++){
            if(list.contains(Character.valueOf(ch))&&list.contains(Character.valueOf(Character.toUpperCase(ch))))
            c++;
        }
        return c;
    }
}