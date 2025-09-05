class Solution {
    public int[] runningSum(int[] nums) {
        int sum=0,k=0;
        int[] res=new int[nums.length];
        res[0]=nums[0];
        res[1]=nums[0]+nums[1];
        sum+=res[1];
        for(int i=2;i<nums.length;i++)
        {
            sum+=nums[i];
            res[i]=sum;
        }
        return res;
    }
}