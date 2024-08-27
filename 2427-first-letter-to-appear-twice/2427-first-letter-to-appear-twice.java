class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> set=new HashSet<>();
        for(char i:s.toCharArray()){
            if(set.contains(i))
            return i;
            else
            set.add(i);
        }
        return 0;
    }
}