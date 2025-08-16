class Solution {
    public int maximum69Number (int num) {
        String s=Integer.toString(num);
        int index = s.indexOf('6');
        if(index == -1) return num;
        char ch[]=s.toCharArray();
        ch[index] = '9';
        return Integer.parseInt(new String(ch));
    }
}