class Solution {
    public int findMin(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;min=Math.min(min,nums[i]),i++);
        return min;
    }
}