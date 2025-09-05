class Solution {
    public int longestSubarray(int[] nums) {
        int max=-1;
        for(int s:nums)
        {
            max=Math.max(max,s);
        }
        int mlen=0;
        int l=0;
        for(int k:nums)
        {
            if(k==max)
            {
                l++;
                mlen=Math.max(mlen,l);
            }
            else
            {
                l=0;
            }
        }
        return mlen;
    }
}