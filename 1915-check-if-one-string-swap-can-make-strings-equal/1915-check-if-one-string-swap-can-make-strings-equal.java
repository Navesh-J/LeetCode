class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int c=0;
        if(s1.equals(s2))
        return true;
        char[] sa=s1.toCharArray();
        char[] sb=s2.toCharArray();
        StringBuilder diff=new StringBuilder();
        for(int i=0;i<s1.length();i++){
            if(sa[i]!=sb[i])
            {
                c++;
                diff.append(sa[i]);
                diff.append(sb[i]);
            }
        }
        if(diff.length()==4){
            return (diff.charAt(0)==diff.charAt(3) && diff.charAt(1)==diff.charAt(2));
        }
        return false;
    }
}