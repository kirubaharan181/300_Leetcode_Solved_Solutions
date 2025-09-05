class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[nums.length]; 
        int j = n;
        int k = 0;
        
        for (int i = 0; i < nums.length; i += 2) 
        {
            res[i] = nums[k++];
            res[i + 1] = nums[j++];
        }
        return res; 
    }
}
