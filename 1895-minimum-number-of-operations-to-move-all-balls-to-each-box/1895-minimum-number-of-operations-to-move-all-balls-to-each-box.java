class Solution {
    public int[] minOperations(String boxes) {
        int n=boxes.length();
        int arr[]=new int[n];
        char[] ch=boxes.toCharArray();
        int left=0,right=0,ans=0;
        for(int i=0;i<n;i++){
            if(ch[i]=='1'){
                ans+=i;
                right++;
            }
        }
        arr[0]=ans;
        if(ch[0]=='1'){
            left++;
            right--;
        }
        for(int i=1;i<n;i++){
            ans-=right;
            ans+=left;
            if(ch[i]=='1'){
                right--;
                left++;
            }
            arr[i]=ans;
        }
        return arr;
    }
}