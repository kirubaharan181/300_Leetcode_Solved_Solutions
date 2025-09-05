class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0,t=0;
        for(int i=0;i<nums.length;sum+=nums[i],i++);
        for(int j=0;j<nums.length;j++)
        {
           sum-=nums[j];
           if(sum==t)
           {
            return j;
           }
           else
           {
                t+=nums[j];
           } 
        }
        return -1;
    }
}