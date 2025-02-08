class Solution {
    public boolean areNumbersAscending(String s) {
        String[] str=s.split(" ");
        int max=-1;
        for(String obj:str){
            if(Character.isDigit(obj.charAt(0))){
                int num=Integer.parseInt(obj);
                if(num <= max) return false;
                max=num;
            }
        }
        return true;
    }
}