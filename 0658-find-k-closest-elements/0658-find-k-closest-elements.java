class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b) -> b[0]-a[0]);
        for(int i=0;i<k;i++){
            pq.offer(new int[]{Math.abs(arr[i]-x),i});
        }
        for(int i=k;i<arr.length;i++){
            int diff = pq.peek()[0];
            int newDiff = Math.abs(arr[i]-x);
            if(newDiff < diff){
                pq.poll();
                pq.offer(new int[]{newDiff,i});
            }
        }
        List<Integer> list=new ArrayList<>();
        while(!pq.isEmpty()){
            int num = arr[pq.poll()[1]];
            list.add(num);
        }
        Collections.sort(list);
        return list;
    }
}