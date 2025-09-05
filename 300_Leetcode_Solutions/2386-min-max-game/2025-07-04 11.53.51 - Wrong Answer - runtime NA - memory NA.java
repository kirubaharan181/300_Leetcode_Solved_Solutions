class Solution {
    public int minMaxGame(int[] nums) {
        int sum=Integer.MAX_VALUE;
        for(int i=1;i<nums.length;i++)
        {
             sum=Math.min(sum,Math.min(nums[i-1],nums[i]));
        }
        return nums.length==1?nums[0]:sum;
    }
}