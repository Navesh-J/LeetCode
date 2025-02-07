class Solution {
    public boolean checkString(String s) {
        int laindex=-1;
        int lbindex=s.length();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a') laindex=i;
            else if(ch=='b') lbindex=i;
            if(laindex>lbindex) return false;
        }
        return true;
    }
}