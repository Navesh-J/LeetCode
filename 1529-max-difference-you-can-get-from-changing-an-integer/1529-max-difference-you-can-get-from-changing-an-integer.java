class Solution {
    public int maxDiff(int num) {
        char ch1='1';
        String str=Integer.toString(num);
        String s=Integer.toString(num);
        for(char ch:str.toCharArray()){
            if(ch != '9'){
                ch1=ch;
                break;
            }
        }
        char ch2 = str.charAt(0);
        String minStr="0";
        if(ch2 != '1'){
            minStr = str.replace(ch2,'1');
        }
        else if(ch2 == '1'){
            for(char ch:str.toCharArray()){
                if(ch!='1' && ch!='0'){
                    ch2 = ch;
                    break;
                }
            }
            if(ch2 == '1') minStr = str;
            else minStr = str.replace(ch2,'0');
        }
        String maxStr = s.replace(ch1, '9');
        return Integer.parseInt(maxStr) - Integer.parseInt(minStr);
    }
}