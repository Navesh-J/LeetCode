class Solution {
    public void duplicateZeros(int[] arr) {
        int n=arr.length;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(arr[i]);
            if(arr[i]==0){
                list.add(0);
            }
        }
        for(int i=0;i<n;i++)
            arr[i]=list.get(i);
    }
}