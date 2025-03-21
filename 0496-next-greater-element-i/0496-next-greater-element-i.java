class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st=new Stack<>();
        int res[]=new int[nums1.length];
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = nums2.length - 1; i >= 0; i--) {
            int num = nums2[i];
            while(!st.isEmpty() && st.peek()<=num){
                st.pop();
            }
            map.put(num,st.isEmpty()?-1:st.peek());
            st.push(num);
        }
        for(int i=0;i<nums1.length;i++){
            res[i]=map.getOrDefault(nums1[i],-1);
        }
        return res;
    }
}