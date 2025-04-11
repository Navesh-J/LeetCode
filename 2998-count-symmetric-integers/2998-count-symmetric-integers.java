class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int res=0;
        for(int i=low;i<=high;i++){
            String num = Integer.toString(i);
            if(num.length() % 2 != 0) continue;
            int mid = num.length()/2;
            String s1 = num.substring(0,mid);
            String s2 = num.substring(mid,num.length());
            if(sum(s1) == (sum(s2)))
                res++;
        }
        return res;
    }
    private int sum(String s){
        int n=Integer.parseInt(s);
        int sum = 0;
        while(n>0){
            int temp = n%10;
            sum+=temp;
            n/=10;
        }
        return sum;
    }
}