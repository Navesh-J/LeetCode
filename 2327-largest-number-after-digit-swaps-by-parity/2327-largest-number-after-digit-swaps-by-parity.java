class Solution {
    public int largestInteger(int num) {
        char[] digits=Integer.toString(num).toCharArray();
        PriorityQueue<Integer> oddHeap=new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> evenHeap=new PriorityQueue<>(Collections.reverseOrder());
        for(char digit:digits){
            int d=digit-'0';
            if(d%2==0)
            evenHeap.add(d);
            else
            oddHeap.add(d);
        }
        for(int i=0;i<digits.length;i++){
            int d=digits[i]-'0';
            if(d%2==0){
                digits[i]=(char)(evenHeap.poll()+'0');
            }
            else{
                digits[i]=(char)(oddHeap.poll()+'0');
            }
        }
        return Integer.parseInt(new String(digits));
    }
}