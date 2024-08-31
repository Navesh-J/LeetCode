class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Set<Integer> set=new TreeSet<>();
        for(int num:arr){
            set.add(num);
        }
        int brr[]=new int[set.size()];
        int x=0;
        for(int num:set){
            brr[x++]=num;
        }
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            int index=Arrays.binarySearch(brr,num);
            arr[i]=index+1;
        }
        return arr;
    }
}