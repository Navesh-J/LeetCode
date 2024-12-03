class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb=new StringBuilder(s);
        int c=0;
        for(int space:spaces){
            space+=c;
            sb.insert(space," ");
            c++;
        }
        return sb.toString();
    }
}