class Solution {
    public int minimumIndex(List<Integer> nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        int maxKey=0,maxValue=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int key=entry.getKey();
            int value=entry.getValue();
            if(maxValue < value){
                maxValue=value;
                maxKey=key;
            }
        }
        int leftCount = 0, rightCount = maxValue;
        int n = nums.size(); 
        for (int i = 0; i < n; i++) {
            if (nums.get(i) == maxKey) {
                leftCount++;
                rightCount--;
            } 
            if (leftCount * 2 > (i + 1) && rightCount * 2 > (n - i - 1)) {
                return i;
            }
        }
        return -1;

    }
}