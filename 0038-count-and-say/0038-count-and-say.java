class Solution {
    public String countAndSay(int n) {
        int count = 1;
        String s = "1";
        for(int i = 1;i<n;i++){
            String temp = countfn(s);
            s = temp;
        }
        return s;
    }
    private String countfn(String s){
        String temp = "";
        int n = s.length();
        int i = 0;
        while(i<n){
            int c=1;
            while((i+1 <n) && ((s.charAt(i)) == (s.charAt(i+1)))){
                c+=1;
                i++;
            }
            String value = Character.toString(s.charAt(i));
            String count = Integer.toString(c);
            temp+=count+value;
            i++;
        }
        return temp;        
    }
}