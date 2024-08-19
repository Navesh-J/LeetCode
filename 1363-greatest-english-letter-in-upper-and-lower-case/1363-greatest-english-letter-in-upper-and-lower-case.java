class Solution {
    public String greatestLetter(String s) {
        for(char ch='z';ch>='a';ch--){
            String a=Character.toString(ch);
            String b=Character.toString(ch-32);
            if(s.contains(a)&&s.contains(b))
            return b;
        }
        return "";
    }
}