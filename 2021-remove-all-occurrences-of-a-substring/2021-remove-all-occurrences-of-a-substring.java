class Solution {
    public String removeOccurrences(String s, String part) {
        int len=part.length();
        StringBuilder sb=new StringBuilder(s);
        while(sb.indexOf(part)!=-1){
            int start=sb.indexOf(part);
            sb=sb.delete(start,start+len);
        }
        return sb.toString();
    }
}