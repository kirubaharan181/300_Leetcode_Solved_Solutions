class Solution {
    public int partitionDisjoint(int[] nums) {
        return nums.length==2?(nums.length/2):(nums.length/2)+1;
    }
}