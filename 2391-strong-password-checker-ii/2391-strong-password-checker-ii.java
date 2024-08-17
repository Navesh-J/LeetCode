class Solution {
    private boolean isSpecial(char ch){
        String s="!@#$%^&*()-+";
        if(s.indexOf(ch)>=0)
        return true;
        return false;
    }
    public boolean strongPasswordCheckerII(String password) {
        int n=password.length();
        boolean hasUpper=false,hasLower=false,hasDigit=false,hasSpecial=false;
        if(n<8)
        return false;
        String str=password+"?";
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1))
            return false;
            char ch=str.charAt(i);
            if(Character.isUpperCase(ch))
            hasUpper=true;
            if(Character.isLowerCase(ch))
            hasLower=true;
            if(Character.isDigit(ch))
            hasDigit=true;
            if(isSpecial(ch))
            hasSpecial=true;
        }
        if(hasUpper==true&&hasLower==true&&hasDigit==true&&hasSpecial==true)
        return true;
        return false;
    }
}