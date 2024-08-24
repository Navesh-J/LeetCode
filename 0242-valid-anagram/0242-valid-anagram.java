class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        return false;
        int arr[]=new int[26];
        int zero[]=new int[26];
        for(int i=0;i<s.length();i++){
            int n=s.charAt(i)-'a';
            arr[n]++;
        }
        for(int i=0;i<t.length();i++){
            int n=t.charAt(i)-'a';
            if(arr[n]<1)
            return false;
            arr[n]--;
        }
        return Arrays.equals(arr,zero);
    }
}