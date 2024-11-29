class Solution {
    public String stringHash(String s, int k) {
        int n=s.length();
        int parts=n/k;
        String arr[]=new String[parts];
        int a=0,index=0;
        int temp=parts;
        while(temp-->0){
            arr[index++]=s.substring(a,a+k);
            a+=k;
        }
        StringBuilder res=new StringBuilder();
        for(int i=0;i<parts;i++){
            int hashedValue=0;
            for(int j=0;j<k;j++){
                hashedValue+=(int)(arr[i].charAt(j)-'a');
            }
            hashedValue%=26;
            char hashedChar=((char)(hashedValue+'a'));
            res.append(hashedChar);
        }
        return res.toString();
    }
}