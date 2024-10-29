class Solution {
    public String reverseWords(String s) {
        String arr[]=s.split(" ");
        for(int i=0;i<arr.length;i++){
            String str=arr[i];
            StringBuilder sb=new StringBuilder(str);
            arr[i]=sb.reverse().toString();            
        }
        return String.join(" ",arr);
    }
}