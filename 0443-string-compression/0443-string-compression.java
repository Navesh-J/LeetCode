class Solution {
    public int compress(char[] chars) {
        int first=0,last=0;
        String str="";
        int c=0;
        while(last<chars.length){
            if(chars[first]==chars[last]){
                c++;
                last++;
            }
            if(last==chars.length){
                if(c>1){
                str+=chars[last-1];
                str+=Integer.toString(c);
                }
                else if(c==1)
                str+=chars[last-1];
            }
            else if(chars[last]!=chars[first]){
                if(c>1){
                    str+=chars[first];
                    str+=Integer.toString(c);
                }
                else if(c==1)
                str+=chars[first];
                first=last;
                c=0;
            }
        }
        for(int i=0;i<str.length();i++){
            chars[i]=str.charAt(i);
        }
        return str.length();
    }
}