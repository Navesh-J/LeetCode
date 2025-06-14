class Solution {
    public int minMaxDifference(int num) {
        int count[]=new int[10];
        char ch1='0';
        String str=Integer.toString(num);
        String s=Integer.toString(num);
        char ch2 = str.charAt(0);
        for(char ch:str.toCharArray()){
            if(ch != '9'){
                ch1=ch;
                break;
            }
        }
        String maxStr = s.replace(ch1, '9');
        String minStr = str.replace(ch2, '0');
        return Integer.parseInt(maxStr) - Integer.parseInt(minStr);
    }
}