class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int[] res=Arrays.stream(nums).distinct().toArray();
        return Arrays.stream(res).sum();
    }
}