class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        int pindex1 = num1.indexOf('+');
        int pindex2 = num2.indexOf('+');
        String x1=num1.substring(0,pindex1);
        String x2=num2.substring(0,pindex2);
        String y1=num1.substring(pindex1+1,num1.length()-1);
        String y2=num2.substring(pindex2+1,num2.length()-1);
        int a1=Integer.parseInt(x1);
        int a2=Integer.parseInt(x2);
        int b1=Integer.parseInt(y1);
        int b2=Integer.parseInt(y2);
        int real = (a1*a2)-(b1*b2);
        int img = (a1*b2)+(a2*b1);
        String complex = Integer.toString(real)+"+"+Integer.toString(img)+"i";
        return complex;
    }
}