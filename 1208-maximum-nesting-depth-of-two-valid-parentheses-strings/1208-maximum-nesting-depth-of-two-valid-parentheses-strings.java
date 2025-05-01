class Solution {
    public int[] maxDepthAfterSplit(String s) {
        int arr[]=new int[s.length()];
        int depth=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                arr[i]=depth%2;
                depth++;
            }else{
                depth--;
                arr[i]=depth%2;
            }
        }
        return arr;
    }
}