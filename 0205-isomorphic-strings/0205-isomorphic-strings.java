class Solution {
    public boolean isIsomorphic(String s, String t) {
        char arr1[]=s.toCharArray();
        char arr2[]=t.toCharArray();
        int n=s.length();
        Map<Character,Character> map=new HashMap<>();
        for(int i=0;i<n;i++){
            char ch1=arr1[i];
            char ch2=arr2[i];
            if(map.containsKey(ch1)){
                if(map.get(ch1)!=ch2 )
                return false;
            }
            else{
                if(map.containsValue(ch2))
                return false;
                map.put(ch1,ch2);
            }
        }
        return true;
    }
}