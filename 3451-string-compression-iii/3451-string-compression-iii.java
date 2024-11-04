class Solution {
    public String compressedString(String word) {
        int n=word.length();
        StringBuilder comp=new StringBuilder();
        int i=0;
        while(i<n){
            int count=0;
            char current = word.charAt(i);
            while(i<n && word.charAt(i)==current && count<9){
                i++;
                count++;
            }
            comp.append(count).append(current);
        }
        return comp.toString();
    }
}