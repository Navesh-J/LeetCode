class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a, b) -> {
            int valueComparison = Integer.compare(a[0], b[0]);
            if (valueComparison == 0) {
                return Integer.compare(a[1], b[1]);
            }
            return valueComparison;
        });
        for(int i=0;i<nums.length;i++){
            int arr[]={nums[i],i};
            pq.offer(arr);
        }
        while(k-->0){
            int arr[]=pq.poll();
            arr[0]*=multiplier;
            pq.offer(arr);
        }
        while(!pq.isEmpty()){
            int arr[]=pq.poll();
            int i=arr[1],n=arr[0];
            nums[i]=n;
        }
        return nums;
    }
}