class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        char ch[] = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',   'n','o', 'p', 'q','r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        String code[]=new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set=new HashSet<>();
        for(String word:words){
            String morse="";
            for(int i=0;i<word.length();i++){
                int index=word.charAt(i)-'a';
                morse+=code[index];
            }
            set.add(morse);
        }
        return set.size();
    }
}