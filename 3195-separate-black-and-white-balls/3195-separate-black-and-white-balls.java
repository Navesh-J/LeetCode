class Solution {
    public long minimumSteps(String s) {
        long c=0,c0=0;
        char arr[]=s.toCharArray();
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]=='0'){
                c0++;
            }
            if(arr[i]=='1')
            c+=c0;

        }
        return c;
    }
}