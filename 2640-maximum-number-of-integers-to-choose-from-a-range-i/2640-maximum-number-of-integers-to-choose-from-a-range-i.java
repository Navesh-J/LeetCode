class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        Set<Integer> set=new HashSet<>();
        for(int num:banned){
            set.add(num);
        }
        int sum=0,c=0;
        for(int i=1;i<=n;i++){
            if(!set.contains(i)){
                if(sum+i > maxSum)
                return c;
                if( (sum+i) <= maxSum){
                    sum+=i;
                    c++;
                }
            }
        }
        return c;
    }
}