class Solution {
    public int possibleStringCount(String word) {
        char arr[]=word.toCharArray();
        int c=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1] == arr[i])
                c++;
        }
        return c;
    }
}