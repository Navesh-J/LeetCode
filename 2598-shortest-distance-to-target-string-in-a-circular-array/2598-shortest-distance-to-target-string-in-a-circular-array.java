class Solution {
    public int closetTarget(String[] words, String target, int startIndex) {
        int n=words.length;
        int distance=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int index=(startIndex+i)%n;
            if(words[index].equals(target)){
                distance=Math.min(distance,i);
            }
        }
        int i=startIndex;
        int c=0;
        do{
            if(words[i].equals(target)){
                distance=Math.min(distance,c);
            }
            i=(i-1+n)%n;
            c++;
        }while(i!=startIndex);
        return distance==Integer.MAX_VALUE?-1:distance;
    }
}