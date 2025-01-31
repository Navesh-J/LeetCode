class Solution {
    public int countPoints(String rings) {
        int n=rings.length();
        int red[]=new int[10];   
        int green[]=new int[10];
        int blue[]=new int[10];
        for(int i=0;i<n-1;i+=2){
            char a=rings.charAt(i);
            int b=(int)rings.charAt(i+1)-'0';
            if(a=='R') red[b]++;
            else if(a=='G') green[b]++;
            else if(a=='B') blue[b]++;
        }
        int res=0;
        for(int i=0;i<10;i++){
            if(red[i]>=1 && green[i]>=1 && blue[i]>=1) res++;
        }
        return res;
    }
}