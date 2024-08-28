class Solution {
    public int search(int[] nums, int target) {
        int first=0,last=nums.length-1;
        int mid=first+(last-first)/2;
        while(last>=first){
            if(nums[mid]==target)
            return mid;
            else if(nums[mid]>target)
            last=mid-1;
            else
            first=mid+1;
            mid=first+(last-first)/2;
        }
        return -1;
    }
}