class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int minL = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) 
        {
            sum += nums[right];

            while (sum >= target) 
            {
                minL = Math.min(minL, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }

        return minL == Integer.MAX_VALUE ? 0 : minL;
    }
}