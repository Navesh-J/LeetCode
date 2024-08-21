class Solution {
    private boolean sum(int num){
        String s=Integer.toString(num);
        int sum=0;
        for(int n:s.toCharArray()){
            sum+=Character.getNumericValue(n);
        }
        if(sum%2==0)
        return true;
        else
        return false;
    }
    public int countEven(int num) {
        int c=0;
        for(int i=0;i<num;i++){
            if(sum(i+1))
            c++;
        }
        return c;
    }
}