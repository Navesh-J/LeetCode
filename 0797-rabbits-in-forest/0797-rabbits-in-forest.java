class Solution {
    public int numRabbits(int[] answers) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int ans:answers){
            map.put(ans,map.getOrDefault(ans,0)+1);
        }
        int total=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int x = entry.getKey();
            int freq = entry.getValue();
            int gsize = x+1;
            int groups = (freq+gsize-1)/gsize;
            total+=(groups*gsize);
        }
        return total;
    }
}