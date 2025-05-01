class Solution {
    public boolean hasMatch(String s, String p) {
      int i =p.indexOf("*");
      int firstPat=s.indexOf(p.substring(0,i));
      int secondPat = s.indexOf(p.substring(i + 1), firstPat + i); 
      if(firstPat !=-1 && secondPat!=-1 ){return true;}
      return false;
    }
}