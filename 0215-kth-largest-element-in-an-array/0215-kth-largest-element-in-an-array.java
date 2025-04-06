class Solution {
    public int findKthLargest(int[] nums, int x) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<x;i++){
            pq.offer(nums[i]);
        }
        for(int i=x;i<nums.length;i++){
            if(pq.peek() < nums[i]){
                pq.poll();
                pq.offer(nums[i]);
            }
        }
        return pq.poll();
    }
}