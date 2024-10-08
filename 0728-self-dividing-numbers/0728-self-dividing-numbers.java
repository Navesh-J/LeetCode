class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list=new ArrayList<>();
        for(int num=left;num<=right;num++){
            String str=Integer.toString(num);
            char nums[]=str.toCharArray();
            boolean flag=false;
            for(char ch:nums){
                int n=(int)ch-48;
                if(n==0 || (num%n!=0)){
                    flag=true;
                }
            }
            if(!flag)
                list.add(num);
        }
        return list;
    }
}