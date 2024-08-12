class Solution {
    public int firstUniqChar(String s) {
        int arr[]=new int[26];
        for(int i=0;i<s.length();i++){
            int ascii=(int)s.charAt(i);
            arr[ascii-97]++;
        }
        for(int i=0;i<s.length();i++){
            int num=(int)s.charAt(i)-97;
            if(arr[num]==1)
            return i;
        }
        return -1;
    }
}