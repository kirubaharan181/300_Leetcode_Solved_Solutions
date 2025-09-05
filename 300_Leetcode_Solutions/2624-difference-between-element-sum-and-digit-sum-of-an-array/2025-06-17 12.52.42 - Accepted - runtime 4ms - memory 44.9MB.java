class Solution {
    public int differenceOfSum(int[] nums) {
        int s1=0,s2=0;
        for(int i=0;i<nums.length;i++)
        {
            s1+=nums[i];
        }
        for(int j=0;j<nums.length;j++)
        {
            int l=(int)Math.log10(nums[j])+1;

            if(l>1)
            {
                int k=nums[j],sum=0;
                while(k>0)
                {
                    int t=k%10;
                    sum+=t;
                    k/=10;
                }
                s2+=sum;
            }
            else
            {
                s2+=nums[j];
            }
            
        }
        return Math.abs(s1-s2);
    }
}