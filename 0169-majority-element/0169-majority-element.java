class Solution {
    public int majorityElement(int[] nums) {
        int element=0,count=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                element=nums[i];
                count=1;
            }
            else if(element==nums[i])
            count++;
            else
            count--;
        }
        count=0;
        for(int i:nums){
            if(i==element)
            count++;
        }
        if(count>Math.floor(nums.length/2))
        return element;
        return -1;
    }
}