class Solution {
    public int minDeletion(String s, int k) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        if (freq.size() <= k) return 0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(freq.values());
        int deletions = 0;
        int remove = freq.size() - k;
        while (remove-- > 0) {
            deletions += minHeap.poll();
        }
        return deletions;
    }
}
