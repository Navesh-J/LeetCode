class Solution {
    public List<Integer> intersection(int[][] nums) {
        int arr[]=new int[1001];
        int r=nums.length;
        int c=nums[0].length;
        for(int[] i:nums){
            for(int j:i){
                arr[j]++;
            }
        }
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<1001;i++){
            if(arr[i]==r)
            list.add(i);
        }
        Collections.sort(list);
        return list;
    }
}