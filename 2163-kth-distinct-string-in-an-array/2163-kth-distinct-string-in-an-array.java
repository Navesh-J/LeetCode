class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String,Integer> map=new HashMap<>();
        for(String a:arr){
            if(map.containsKey(a)){
                map.put(a,map.get(a)+1);
            }
            else
            map.put(a,1);
        }
        List<String> list=new ArrayList<>();
        for(String q:arr){
            if(map.get(q)==1)
            list.add(q);
        }
        if(list.size()<k)
        return "";
        return list.get(k-1);
    }
}