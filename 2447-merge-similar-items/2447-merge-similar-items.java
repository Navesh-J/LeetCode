class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> res=new ArrayList<>();
        Map<Integer,Integer> map=new TreeMap<>();
        for(int[] num:items1){
            int ey=num[0],value=num[1];
            map.put(ey,value);
        }
        for(int[] num:items2){
            int ey=num[0],value=num[1];
            if(map.containsKey(ey)){
                map.put(ey,map.get(ey)+value);
            }else{
                map.put(ey,value);
            }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            res.add(Arrays.asList(entry.getKey(), entry.getValue()));
        }
        return res;
    }
}