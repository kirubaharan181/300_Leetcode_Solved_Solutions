class Solution {
    public boolean containsDuplicate(int[] nums) {
        int i = 0, j = 1, k = 0;
        int[] c = new int[nums.length];
        boolean b = false;
        
        while (i < nums.length - 1) {
            if (nums[i] == nums[j]) {
                c[k++]++;
            }
            j++;
            if (j == nums.length) {
                i++;
                j = i + 1;
            }
        }

        i = 0;
        while (i < c.length) {
            if (c[i] >= 1) {
                b = true;
                break;
            }
            i++;
        }
        return b;
    }
}
