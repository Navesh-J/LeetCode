class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length() != goal.length()) return false;
        Map<Character,Integer> map1=new HashMap<>();
        boolean moreThanOnce=false;
        for(char ch:s.toCharArray()){
            map1.put(ch,map1.getOrDefault(ch,0)+1);
            if(map1.get(ch)>1)
                moreThanOnce=true;
        }
        List<Character> list1=new ArrayList<>();
        List<Character> list2=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            list1.add(s.charAt(i));
            list2.add(goal.charAt(i));
        }
        Collections.sort(list1);
        Collections.sort(list2);
        if(!list1.equals(list2)) return false;
        if(s.equals(goal) && !moreThanOnce) return false;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != goal.charAt(i)){
                count++;
            }
        }
        if(count > 2) return false;
        return true;
    }
}