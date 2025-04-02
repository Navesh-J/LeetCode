class Solution {
    public int[] maxSlidingWindow(int[] nums, int x) {
        int n=nums.length;
        int res[]=new int[n-x+1];
        Deque<Integer> q = new ArrayDeque<>();
        for(int i=0;i<x;i++){
            while(!q.isEmpty() && nums[i] >= nums[q.peekLast()])
                q.removeLast();
            q.addLast(i);
        }
        int j=0;
        for(int i=x;i<n;i++){
            res[j++] = nums[q.peek()];
            while(!q.isEmpty() && q.peek() <= i-x)
                q.removeFirst();
            while(!q.isEmpty() && nums[i] >= nums[q.peekLast()])
                q.removeLast();
            q.addLast(i);
        }
        res[j]=nums[q.peek()];
        return res;
    }
}