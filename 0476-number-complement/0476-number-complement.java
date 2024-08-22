class Solution {
    public int findComplement(int num) {
        String binary=Integer.toBinaryString(num);
        String cmp="";
        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i)=='1')
            cmp+="0";
            else
            cmp+="1";
        }
        return Integer.parseInt(cmp,2);
    }
}