class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = (s.length()+k-1)/k;
        String arr[]=new String[n];
        int x=0;
        for(int i=0;i<s.length();i+=k){
            int end = Math.min(i + k, s.length());
            String part = s.substring(i, end);
            if (part.length() < k) {
                while (part.length() < k) part += fill;
            }
            arr[x++] = part;
        }
        return arr;
    }
}