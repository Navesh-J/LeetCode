class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        for(Character jewel:jewels.toCharArray())
        for(Character stone:stones.toCharArray())
            if(stone==jewel)
            count++;
        return count;
    }
}