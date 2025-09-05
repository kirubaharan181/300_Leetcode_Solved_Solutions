class Solution {
    public int maximumCount(int[] nums) {
        int s1=0,s2=0,max=0;
        for(int k:nums)
        {
            if(k!=0)
            {
                if(k>0)
                {
                    s1++;
                }
                else
                {
                    s2++;
                }
            }
        }
        return Math.max(s1,s2);
    }
}