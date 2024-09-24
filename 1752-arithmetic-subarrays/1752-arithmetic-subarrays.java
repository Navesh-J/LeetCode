class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        int n=l.length;
        int x=0;
        List<Boolean> list=new ArrayList<>();
        while(x<n){
            int index=0;
            int arr[]=new int[(r[x]-l[x]+1)];
            for(int i=l[x];i<=r[x];i++){
                arr[index++]=nums[i];
            }
            Arrays.sort(arr);
            boolean flag=true;
            int d=arr[1]-arr[0];
            for(int i=0;i<arr.length-1;i++){
                if((arr[i+1]-arr[i])!=d)
                flag=false;
            }
            list.add(flag);
            x++;
        }
        return list;
    }
}