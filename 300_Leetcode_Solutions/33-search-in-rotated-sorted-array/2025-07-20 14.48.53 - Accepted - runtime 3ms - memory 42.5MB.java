class Solution {
    public int search(int[] nums, int target) {
        
        System.out.println(Arrays.toString(nums));
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                return i;
            }
        }
        return -1;
    }
}