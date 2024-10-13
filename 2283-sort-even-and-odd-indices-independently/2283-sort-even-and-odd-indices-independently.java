class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n=nums.length;int esize,osize;
        if(n%2==0){
            esize =n/2;
            osize=n/2;
        }
        else{
            esize=n/2+1;
            osize=n/2;
        }
        int even[]=new int[esize];
        int odd[]=new int[osize];
        int a=0,b=0;
        for(int i=0;i<n;i++){
            if(i%2==0)
            even[a++]=nums[i];
            else
            odd[b++]=nums[i];
        }
        Arrays.sort(even);
        Arrays.sort(odd);
        a=0;b=odd.length-1;
        for(int i=0;i<n;i++){
            if(i%2==0)
            nums[i]=even[a++];
            else
            nums[i]=odd[b--];
        }
        return nums;
    }
}