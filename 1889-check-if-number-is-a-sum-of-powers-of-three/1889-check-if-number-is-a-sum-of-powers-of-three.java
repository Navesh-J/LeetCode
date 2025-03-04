class Solution {
    public boolean checkPowersOfThree(int n) {
        String base3 = Integer.toString(n,3);
        for(char ch:base3.toCharArray()){
            if(ch == '2')
                return false;
        }
        return true;
    }
}