class Solution {
    public char kthCharacter(int k) {
        String s="a";
        while(s.length() < k){
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                if(ch == 'z') ch='a';
                else ch = (char)(ch+1);
                sb.append(ch);
            }
            s+=sb.toString();
        }
        return s.charAt(k-1);
    }
}