class Solution {
    public int maximumProduct(int[] nums) {
        int res=1;
        for(int k:nums)
        {
            res*=k;
        }
        return res;
    }
}