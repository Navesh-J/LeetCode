class Solution {
    private boolean isVowel(char ch){
        String s="aeiou";
        return s.indexOf(ch)<0?false:true;
    }
    public int maxFreqSum(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int max1=0,max2=0;
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch:map.keySet()){
            if(isVowel(ch)){
                max1=Math.max(max1,map.get(ch));
            }else{
                max2=Math.max(max2,map.get(ch));
            }
        }
        return max1+max2;
    }
}