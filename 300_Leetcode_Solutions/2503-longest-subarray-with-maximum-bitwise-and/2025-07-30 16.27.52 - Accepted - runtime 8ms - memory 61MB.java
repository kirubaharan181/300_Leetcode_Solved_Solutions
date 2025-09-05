class Solution {
    public int longestSubarray(int[] nums) {
        int max=Arrays.stream(nums).max().getAsInt();
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