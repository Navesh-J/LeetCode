class Solution {
    public int minimumCardPickup(int[] cards) {
        Map<Integer,Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for(int i=0;i<cards.length;i++){
            int card = cards[i];
            if(map.containsKey(card)){
                min = Math.min(min,i-map.get(card)+1);
            }
            map.put(card,i);
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
}