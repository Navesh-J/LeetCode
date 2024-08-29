class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;(2*i+1)<nums.length;i++){
            int freq=nums[2*i];
            int value=nums[2*i+1];
            while(freq>0){
                list.add(value);
                freq--;
            }
        }
        int arr[]=new int[list.size()];
        int x=0;
        for(int i:list)
        arr[x++]=i;
        return arr;
    }
}