class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++)
        {
            if(target.index(nums.charAt(i)))
            {
                return index(i);
            }
        }
        return 0;
    }
}