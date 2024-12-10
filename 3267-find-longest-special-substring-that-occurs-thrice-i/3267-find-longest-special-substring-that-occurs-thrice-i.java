class Solution {
    public int maximumLength(String s) {
        int n = s.length();
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            char currentChar=s.charAt(i);
            for(int j=i+1;j<=n;j++){
                if(s.charAt(j-1)!=currentChar){
                    break;
                }
                String sbstr=s.substring(i,j);
                map.put(sbstr,map.getOrDefault(sbstr,0)+1);
            }
        }
        int max=-1;
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            String str=entry.getKey();
            int count=entry.getValue();
            if(count>=3){
                max=Math.max(max,str.length());
            }
        }
        return max;
    }
}