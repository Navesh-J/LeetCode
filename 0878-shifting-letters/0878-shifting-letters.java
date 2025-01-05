class Solution {
    private char shiftfn(char ch,long shift){
        shift%=26;
        long ascii=(long)ch + shift;
        if(ascii > 122){
            ascii-=26;
        }
        return (char)ascii;
    }
    public String shiftingLetters(String s, int[] shif) {
        long shifts[]=new long[shif.length];
        shifts[shif.length-1]=shif[shif.length-1];
        for(int i=shifts.length-2;i>=0;i--){
            shifts[i]=shif[i]+shifts[i+1];
        }
        char arr[]=s.toCharArray();
        for(int i=0;i<s.length();i++){
            long shift=shifts[i];
            arr[i]=shiftfn(arr[i],shift);
        }
        return new String(arr);
    }
}