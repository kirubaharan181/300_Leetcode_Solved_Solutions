class Solution {
    public int findMin(int[] nums) {
        int i=0,j=nums.length-1,min=Integer.MAX_VALUE;
        while(i<j)
        {
            min=Math.min(nums[i++],nums[j--]);
        }
        return nums.length==1?nums[nums.length-1]:min;
    }
}