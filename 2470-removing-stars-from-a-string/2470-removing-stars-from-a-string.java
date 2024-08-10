class Solution {
    public String removeStars(String s) {
        StringBuilder str=new StringBuilder();
        for(char i:s.toCharArray()){
            if(i=='*')
            str.deleteCharAt(str.length()-1);
            else
            str.append(i);
        }
        return str.toString();
    }
}