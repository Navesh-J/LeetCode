class Solution {
    private boolean isVowel(char ch){
        return "aeiouAEIOU".indexOf(ch) >= 0;
    }
    public String sortVowels(String s) {
        char arr[]=s.toCharArray();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(isVowel(arr[i])){
                int value=(int)arr[i];
                list.add(value);
            }
        }
        Collections.sort(list);
        for(int i=0,j=0;i<arr.length;i++){
            if(isVowel(arr[i])){
                int val=list.get(j++);
                arr[i]=(char)val;
            }
        }
        return new String(arr);
    }
}