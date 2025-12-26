class Solution {
    public int bestClosingTime(String customers) {
        int min_penalty=0;
        for(char customer:customers.toCharArray())
            min_penalty+= (customer == 'Y'? 1 : 0);
        int res = 0;
        int penalty=min_penalty;
        for(int i=0;i<customers.length();i++){
            int hour = i+1;
            char customer = customers.charAt(i);
            if(customer == 'Y')
                penalty-=1;
            else
                penalty+=1;
            if(penalty<min_penalty){
                res = hour;
                min_penalty = penalty;
            }
        }
        return res;
    }
}