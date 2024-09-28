class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=candies[0];
        for(int candy:candies){
            if(max<candy)
            max=candy;
        }
        List<Boolean> list=new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            int currentCandy=candies[i]+extraCandies;
            if(currentCandy>=max)
            list.add(true);
            else
            list.add(false);
        }
        return list;
    }
}