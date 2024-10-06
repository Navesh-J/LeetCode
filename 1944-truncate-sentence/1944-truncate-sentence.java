import java.util.*;
class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder sb=new StringBuilder();
        StringTokenizer obj=new StringTokenizer(s);
        while(k>0){
            sb.append(obj.nextToken());
            k--;
            if(k>0)
            sb.append(" ");
        }
        return sb.toString();
    }
}