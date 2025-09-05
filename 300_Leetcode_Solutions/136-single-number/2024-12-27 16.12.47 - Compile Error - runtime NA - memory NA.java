class Solution {
    public int singleNumber(int[] nums) {
        
        int res;
        for(int i=0;i<nums.length-1;i++)
        {
          for(int j=i+1;j<nums.length;j++)
          {
            if(nums[i]!=nums[j])
            {
                 res =nums[i];
                
            }
          }
        }




















        
        return res;
    }
}