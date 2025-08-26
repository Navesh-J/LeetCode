class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int index=-1,i=0;double max=0;
        for(int arr[]:dimensions){
            int l=arr[0],b=arr[1];
            double diag = (l*l)+(b*b);
            diag = Math.sqrt(diag);
            if(diag == max && (l*b)>(dimensions[index][0]*dimensions[index][1])){
                index = i;
            }
            if(diag>max){
                max = diag;
                index = i;
            }
            i++;
        }
        return dimensions[index][0]*dimensions[index][1];
    }
}