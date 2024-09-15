class Solution {
    public int secondHighest(String s) {
        Set<Integer> set=new TreeSet<>();
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch))
            set.add(Character.getNumericValue(ch));
        }
        List<Integer> list=new ArrayList<>(set);
        Collections.reverse(list);
        if(list.size()>=2)
        return list.get(1);
        return -1;
    }
}