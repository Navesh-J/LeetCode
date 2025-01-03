class Solution {
    public int findMaxLength(int[] nums) {
        int res=0;
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(nums[i]==0)
                nums[i]=-1;
        }
        int sum=0,psum=0;
        for(int i=0;i<n;i++){
            psum+=nums[i];
            if(psum == sum)
                res=i+1;
            if(!map.containsKey(psum)){
                map.put(psum,i);
            }
            if(map.containsKey(psum)){
                res=Math.max(res,i-map.get(psum));
            }
        }
        return res;
    }
}