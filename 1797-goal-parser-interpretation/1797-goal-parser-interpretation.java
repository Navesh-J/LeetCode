class Solution {
    public String interpret(String command) {
        String str="";
        int l=command.length(),i=0;
        char arr[]=command.toCharArray();
        while(i<l){
            if(arr[i]=='G'){
                str+="G";
                i++;
            }
            else if(arr[i]=='('&&arr[i+1]==')'){
                str+="o";
                i+=2;
            }
            else if(arr[i]=='('&&arr[i+1]=='a'){
                str+="al";
                i+=4;
            }
        }
        return str;
    }
}