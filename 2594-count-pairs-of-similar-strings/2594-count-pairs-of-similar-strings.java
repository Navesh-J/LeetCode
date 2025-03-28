class Solution {
    public int similarPairs(String[] words) {
        int res=0,n=words.length;
        Map<HashSet<Character>,Integer> map=new HashMap<>();
        for(String word:words){
            HashSet<Character> set=new HashSet<>();
            for(char ch:word.toCharArray()){
                set.add(ch);
            }
            if(map.containsKey(set)){
                map.put(set,map.get(set)+1);
            }else{
                map.put(set,1);
            }
        }
        for(int c:map.values()){
            res += (c *(c - 1)) / 2;
        }
        return res;
    }
}