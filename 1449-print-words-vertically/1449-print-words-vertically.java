class Solution {
    public List<String> printVertically(String s) {
        String [] str=s.split(" ");
        int n=0;
        for(String ss:str){
            if(ss.length()>n)
            n=ss.length();
        }
        List<String> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            StringBuilder sb=new StringBuilder();
            for(String ss:str){
                if(i<ss.length())
                sb.append(ss.charAt(i));
                else
                sb.append(' ');
            }
            list.add(sb.toString().stripTrailing());
        }
        return list;
    }
}