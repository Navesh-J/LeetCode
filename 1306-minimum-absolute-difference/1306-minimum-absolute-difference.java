class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        int min_diff=arr[1]-arr[0];
        int i=0;
        while(i<arr.length-1){
            min_diff = Math.min(min_diff,(arr[i+1]-arr[i]));
            i++;
        }
        for(i=0;i<arr.length-1;i++){
            int diff = arr[i+1]-arr[i];
            if(diff == min_diff){
                res.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }
        return res;
    }
}