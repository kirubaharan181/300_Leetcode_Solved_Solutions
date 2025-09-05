import java.util.Arrays;

class Solution {
    public void moveZeroes(int[] nums) {
        Arrays.sort(nums); 
        int k = 0;
        int l = nums.length;

        for (int i = 0; i < l; i++) {
            if (nums[i] != 0) {
                nums[k++] = nums[i];
            }
        }

        while (k < l) {
            nums[k++] = 0;
        }
    }
}
