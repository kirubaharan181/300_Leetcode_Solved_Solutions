class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<nums.length;sum+=nums[i],i++);
        return sum%k;
    }
}