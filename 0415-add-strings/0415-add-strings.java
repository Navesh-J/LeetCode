class Solution {
    private int add(char a, char b){
        return (a-'0')+(b-'0');
    }
    public String addStrings(String num1, String num2) {
        if(num1.length()<num2.length()){
            String temp=num1;
            num1=num2;
            num2=temp;
        }
        StringBuilder s2=new StringBuilder(num2);
        while(s2.length()<num1.length())
            s2.insert(0,'0');
        num2=s2.toString();
        String str="";
        int carry=0;
        for(int i=num1.length()-1;i>=0;i--){
            char a=num1.charAt(i);
            char b=num2.charAt(i);
            int sum=add(a,b)+carry;
            carry=sum/10;
            char res=(char)(sum%10+48);
            str=res+str;
        }
        if(carry>0)
            str=(char)(carry+48) + str;
        return str;
    }
}