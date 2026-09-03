class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>(List.of(1)));
        for(int i=0;i<n-1;i++){
            List<Integer> prev = new ArrayList<>(res.get(res.size()-1));

            prev.add(0,0); prev.add(0);

            List<Integer> row = new ArrayList<>();

            for(int j=0;j<prev.size()-1;j++){
                row.add(prev.get(j) + prev.get(j+1));
            }

            res.add(row);
        }
        return res;
    }
}