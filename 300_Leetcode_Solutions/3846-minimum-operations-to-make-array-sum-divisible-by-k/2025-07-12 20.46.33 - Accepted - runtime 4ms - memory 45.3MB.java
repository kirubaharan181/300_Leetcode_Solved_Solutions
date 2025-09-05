class Solution {
    public int minOperations(int[] nums, int k) {
        int res=Arrays.stream(nums).sum();
        return res%k;
    }
}