class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<sb.length()-2;){
            if((sb.charAt(i) == sb.charAt(i+2)) && (sb.charAt(i) == sb.charAt(i+1)))
                sb.deleteCharAt(i);
            else i++;
        }
        return sb.toString();
    }
}