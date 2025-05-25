class Solution {
    private boolean isPalindrome(String s){
        return s.charAt(0) == s.charAt(1);
    }
    private String getPalindrome(String s){
        String str=""+s.charAt(1)+s.charAt(0);
        return str;
    }
    public int longestPalindrome(String[] words) {
        Map<String,Integer> map=new HashMap<>();
        int res=0;
        boolean flag=false;
        for(String word:words){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        for(String word:map.keySet()){
            // int count = map.get(word);
            if(isPalindrome(word)){
                int count = map.get(word);
                res += (count / 2) * 4;
                if(count % 2 == 1) flag = true;
            } else {
                String rev = getPalindrome(word);
                if(map.containsKey(rev)){
                    int pairs = Math.min(map.get(word), map.get(rev));
                    res += pairs * 4;
                    map.put(word, 0);
                    map.put(rev, 0);
                }
            }
        }
        if(flag) res+=2;
        return res;
    }
}