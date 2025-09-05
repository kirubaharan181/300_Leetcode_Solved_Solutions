class Solution {
    public int findDuplicate(int[] nums) {
        int l=nums.length;
        int count[]=new int[l];
        for(int i=0;i<nums.length;i++)
        {   
            int c=0;
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    c++;
                } 
                 
            }
            count[i]=c; 
        }

        int max=0; 
       for(int i=0;i<l;i++)
       {
        if(count[i]>max)
        {
            max=count[i];
        }
        
       }
        return nums[i];
    }
}