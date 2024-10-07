class Solution {
    public int minLength(String s) {
        boolean flag=false;
        StringBuilder sb=new StringBuilder(s);
        String str1 = "AB";
        String str2 = "CD";
        if((s.contains(str1))||(s.contains(str2)))
        flag=true;
        while(flag){
            for(int i=0;i<sb.length()-1;i++){
                String sub=sb.substring(i,i+2);
                if((sub.equals(str1)) ||(sub.equals(str2)))
                sb.delete(i,i+2);
            }
            if((sb.toString().contains(str1)) || (sb.toString().contains(str2)))
            flag=true;
            else
            flag=false;
        }
        return sb.length();
    }
}