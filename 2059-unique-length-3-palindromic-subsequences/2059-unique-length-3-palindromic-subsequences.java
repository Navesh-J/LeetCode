class Solution {
    public int countPalindromicSubsequence(String s) {
        int count[]=new int[26];
        for(char ch:s.toCharArray()){
            int index=ch-'a';
            count[index]++;
        }
        Set<String> set=new HashSet<>();
        for(int i=0;i<26;i++){
            if(count[i]>=2){
                char ch=(char)(i+97);
                int last=s.lastIndexOf(ch);
                int first=s.indexOf(ch);
                char word[]=new char[3];
                word[0]=ch;word[2]=ch;
                for(int j=first+1;j<=last-1;j++){
                    word[1]=s.charAt(j);
                    set.add(new String(word));
                }
            }
        }
        return set.size();
    }
}