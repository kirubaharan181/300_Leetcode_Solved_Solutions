class Solution {
    public int maximumDifference(int[] nums) {
        int[] k = new int[nums.length * nums.length]; 
        int ind = 0;
        for (int i = 0; i < nums.length - 1; i++) 
        {
            for (int j = i + 1; j < nums.length; j++) 
            {
                if (nums[j] > nums[i]) 
                {
                    k[ind++] = Math.abs(nums[j] - nums[i]);
                }
            }
        }
        int max1 = Arrays.stream(k).max().getAsInt();
        if (max1 == 0) {
            return -1;
        }
        return max1;
    }
}