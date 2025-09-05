class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> l=new ArrayList<>();
        if(nums.length==1)
        {
            l.add(nums[0]);
            return l;
        }
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]%nums[j]==0 || nums[j]%nums[i]==0)
                {
                    if(!l.contains(nums[i]) && !l.contains(nums[j]))
                    {
                        l.add(nums[i]);
                        l.add(nums[j]);
                    }
                    
                }
            }
        }
        return l;
    }
}