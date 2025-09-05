class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=nums.length;
        int c=0;
        int res=0;
        for(int i=0;i<l-1;i++)
        {
            
            for(int j=i+1;j<l;j++)
            {
                 res=nums[i]+nums[j];

                if(nums[i]==target || nums[j]==target)
                {
                    return 1;
                    
                }
                else
                {
                if(nums[i]+nums[j]==target)
                {
                    return 2;
                    
                }
                else if(res==target)
                {
                    c++;
                }
                }
            }
            res=0;
        }
        return c;
    }
}