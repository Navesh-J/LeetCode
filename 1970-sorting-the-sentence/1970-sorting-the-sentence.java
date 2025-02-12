class Solution {
    public String sortSentence(String s) {
        String[] str=s.split(" ");
        String res[]=new String[str.length];
        for(String i:str){
            int index=(i.charAt(i.length()-1)) - '1';
            i=i.substring(0,i.length()-1);
            res[index]=i;
        }
        return String.join(" ",res);
    }
}