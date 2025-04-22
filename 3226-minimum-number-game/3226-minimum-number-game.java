class Solution {
    public int[] numberGame(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int arr[]=new int[nums.length];
        for(int num:nums){
            pq.offer(num);
        }
        for(int i=0;i<nums.length;i+=2){
            int a = pq.poll();
            int b = pq.poll();
            arr[i] = b;
            arr[i+1] = a;
        }
        return arr;
    }
}