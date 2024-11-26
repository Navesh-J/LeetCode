class Solution {
    public int magicalString(int n) {
        if(n<=3) return 1;
        StringBuilder sb=new StringBuilder("122");
        int index=2;
        while(index<n){
            char ch=sb.charAt(index);
            int count=sb.charAt(index)-'0';
            char chara=sb.charAt(sb.length()-1);
            while(count-->0){
                if(chara=='1')
                    sb.append("2");
                else sb.append("1");
            }
            index++;
        }
        int c=0;
        for(int i=0;i<n;i++){
            char ch=sb.charAt(i);
            if(ch=='1') c++;
        }
        return c;
    }
}