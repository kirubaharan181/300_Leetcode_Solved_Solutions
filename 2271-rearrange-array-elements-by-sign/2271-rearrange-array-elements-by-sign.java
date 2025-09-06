class Solution {
    public int[] rearrangeArray(int[] nums) {
        int p=0,n=1;
        int[] res=new int[nums.length];
        for(int k:nums)
        {
            if(k>0)
            {
                res[p]=k;
                p+=2;
            }
            else
            {
                res[n]=k;
                n+=2;
            }
        }
        return res;
    }
}