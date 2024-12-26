class Solution {
    public String repeatLimitedString(String s, int repeatLimit) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        int count[]=new int[26];
        for (char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                pq.offer(new int[]{i, count[i]});
            }
        }
        StringBuilder result = new StringBuilder();
        while(!pq.isEmpty()){
            int arr[]=pq.poll();
            int c=Math.min(arr[1],repeatLimit);
            String ch=Character.toString((char)(arr[0]+97));
            result.append(ch.repeat(c));
            if(arr[1]>c){
                if(pq.isEmpty()) break;
                int arr2[]=pq.poll();
                result.append((char)(arr2[0]+'a'));
                if (--arr2[1] > 0) {
                    pq.offer(arr2);
                }
                pq.offer(new int[]{arr[0], arr[1] - c});
            }
        }
        return result.toString();
    }
}