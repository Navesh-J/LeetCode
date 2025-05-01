class Solution {
    public boolean hasMatch(String s, String p) {
        String[] parts = p.split("\\*", -1);
        String p1 = parts[0], p2 = parts[1];
        int i;
        int i1=-1,i2=-1;
        if(s.contains(p1))
            i1 = s.indexOf(p1);
        if(s.contains(p2))
            i2 = s.lastIndexOf(p2);
        if((i1+p1.length())<=i2 && i1!=-1) return true;
        return false;
    }
}