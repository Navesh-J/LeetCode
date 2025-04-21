class KthLargest {

    PriorityQueue<Integer> pq = new PriorityQueue<>();      
    int x;
    public KthLargest(int x, int[] nums) {
        this.x = x;
        for(int num:nums) add(num);
    }
    
    public int add(int val) {
        pq.offer(val);
        if(pq.size() > x)
            pq.poll();
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */