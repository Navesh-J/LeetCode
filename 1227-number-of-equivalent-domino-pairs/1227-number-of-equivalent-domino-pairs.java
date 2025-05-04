class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        Map<String,Integer> map = new HashMap<>();
        for(int[] domino:dominoes){
            if(domino[0]>domino[1]){
                int temp=domino[0];
                domino[0]=domino[1];
                domino[1]=temp;
            }
            String key = domino[0]+","+domino[1];
            map.put(key,map.getOrDefault(key,0)+1);
        }
        int res=0;
        for (int count : map.values()) {
            if (count > 1) {
                res += count * (count - 1) / 2;
            }
        }
        return res;
    }
}