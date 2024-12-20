class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        for(List<String> list :items){
            String type=list.get(0);
            String color=list.get(1);
            String name=list.get(2);
            boolean a=(ruleKey.equals("type")) && (ruleValue.equals(type));
            boolean b=(ruleKey.equals("color")) && (ruleValue.equals(color));
            boolean c=(ruleKey.equals("name")) && (ruleValue.equals(name));
            if(a || b ||c)
                count++;
        }
        return count;
    }
}