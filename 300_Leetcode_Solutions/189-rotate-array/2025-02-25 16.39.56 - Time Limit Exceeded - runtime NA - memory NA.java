class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int l = n - 1;

        for (int j = 0; j < k; j++) 
        {
            int lt = nums[l];
            for (int i = l; i > 0; i--) 
            {
                nums[i] = nums[i - 1];
            }
            nums[0] = lt;
        }
    }
}