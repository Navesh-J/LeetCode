class Solution {
    public int[] separateDigits(int[] nums) {
        StringBuilder s=new StringBuilder();
        for(int num:nums){
            s.append(Integer.toString(num));
        }
        char arr[]=s.toString().toCharArray();
        int a[]=new int[s.length()];
        for(int i=0;i<arr.length;i++){
            a[i]=arr[i]-'0';
        }
        return a;
    }
}