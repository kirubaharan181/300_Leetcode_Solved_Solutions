class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int c=0,d=0;
        for(int k:nums)
        {
            d+=k;
            if(d==0)
            {
                c++;
            }
        }
        return c;
    }
}