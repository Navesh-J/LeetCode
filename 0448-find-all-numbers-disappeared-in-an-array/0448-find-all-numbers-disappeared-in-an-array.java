class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        List<Integer> l=new ArrayList<>();
        int arr[]=new int[n+1];
        for(int i=0;i<n;i++)
        arr[nums[i]]++;
        for(int i=1;i<n+1;i++){
            if(arr[i]==0)
            l.add(i);
        }
        return l;
    }
}