class Solution {
    public int maxFrequencyElements(int[] nums) {
        int count[]=new int[101];
        int max=0;
        for(int num:nums){
            count[num]++;
            max=Math.max(max,count[num]);
        }
        int c=0;
        for(int i=1;i<count.length;i++){
            if(count[i]==max){
                c+=count[i];
            }
        }
        return c;
    }
}