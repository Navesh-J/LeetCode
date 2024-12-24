class Solution {
    public int countHillValley(int[] arr) {
        List<Integer> list=new ArrayList<>();
        list.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(arr[i] != list.get(list.size()-1))
                list.add(arr[i]);
        }
        int nums[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            nums[i]=list.get(i);
        }
        int res=0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1])
                res++;
            else if (nums[i] < nums[i - 1] && nums[i] < nums[i + 1])
                res++;
        }
        return res;
    }
}