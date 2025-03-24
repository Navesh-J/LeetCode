class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> list=new ArrayList<>(Arrays.asList(words));
        for(int i=0;i<list.size()-1;){
            String a = list.get(i);
            char[] ch=a.toCharArray();
            Arrays.sort(ch);
            a = new String(ch);
            String b = list.get(i+1);
            ch=b.toCharArray();
            Arrays.sort(ch);
            b = new String(ch);
            if(a.equals(b)){
                list.remove(list.get(i+1));
            }else{
                i++;
            }
        }
        return list;
    }
}