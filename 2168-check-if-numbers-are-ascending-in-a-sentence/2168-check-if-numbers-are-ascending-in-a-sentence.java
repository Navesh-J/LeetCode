class Solution {
    public boolean areNumbersAscending(String s) {
        String[] str=s.split(" ");
        int max=-1;
        for(String obj:str){
            if(obj.matches("\\d+")){
                int num=Integer.parseInt(obj);
                if(num <= max) return false;
                max=Math.max(num,max);
            }
        }
        return true;
    }
}