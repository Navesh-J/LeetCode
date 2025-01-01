class Solution {
    public int maxScore(String s) {
        int ls=0,rs=0;
        for(char ch:s.toCharArray()){
            if(ch=='1')
                rs+=1;
        }
        int score=0;
        if(rs==0)
            return s.length()-1;
        for(int i = 0; i < s.length() - 1; i++){
            char ch=s.charAt(i);
            if(ch=='0')
                ls++;
            else if(ch=='1')
                rs--;
            score=Math.max(score,(ls+rs));
        }
        return score;
    }
}