class Solution {
    public int[] sortByBits(int[] arr) {
        Integer newArr[]=new Integer[arr.length];
        for(int i=0;i<arr.length;i++)
        newArr[i]=arr[i];
        Arrays.sort(newArr,(a,b) -> {
                int countA=Integer.bitCount(a);
                int countB=Integer.bitCount(b);
                if(countA==countB)
                return a-b;
                else
                return countA-countB;
        });
        for(int i=0;i<arr.length;i++)
        arr[i]=newArr[i];
        return arr;
    }
}