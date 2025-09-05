class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int i=0,j=1;
        int[] res=new int[nums.length];
        for(int k: nums)
        {
            if(k%2==0)
            {
                res[i]=k;
                i+=2;
            }
            else
            {
                res[j]=k;
                j+=2;
            }
        }
        return res;
    }
}