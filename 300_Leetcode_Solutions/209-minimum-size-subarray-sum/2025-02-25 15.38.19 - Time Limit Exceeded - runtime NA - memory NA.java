
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = nums.length;
        int minL = 0;

        for (int i = 0; i < l; i++) 
        {
            int sum = 0;
            for (int j = i; j < l; j++) 
            {
                sum += nums[j];

                if (sum >= target) 
                {
                    int c = j - i + 1;
                    if (minL == 0 || c < minL) 
                    {
                        minL = c;
                    }
                    break;
                }
            }
        }

        return minL;
    }
}