class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        char ch=' ';
        int max=0;
        for(int i=0;i<s.length();i++){
            int a=s.indexOf(s.charAt(i));
            int b=s.lastIndexOf(s.charAt(i));
            int d=b-a;
            if(max<d){
                max=d;
                ch=s.charAt(i);
            }
        }
        if(max==0)
        return -1;
        int a=s.indexOf(ch)+1;
        int b=s.lastIndexOf(ch);
        return b-a;
    }
}