class Solution {
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> l=new ArrayList<>();
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            c=0;
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[j]<nums[i])
                {
                   c++;
                }
            }
            l.add(c);
        }
        return l;
    }
}