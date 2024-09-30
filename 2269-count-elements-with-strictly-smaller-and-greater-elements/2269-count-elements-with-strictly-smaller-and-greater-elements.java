class Solution {
    public int countElements(int[] nums) {
        int min=nums[0],max=nums[0];
        for(int num:nums)
        {
            if(num>max)
            max=num;
            if(num<min)
            min=num;
        }
        int count=0;
        for(int num:nums){
            if(num!=max && num!=min)
            count++;
        }
        return count;
    }
}