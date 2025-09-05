class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int sum=0;
        for(char k1:jewels.toCharArray())
        {
            for(char k2:stones.toCharArray())
            {
                if(k1==k2)
                {
                    sum++;
                }
            }
        }
        return sum;
    }
}