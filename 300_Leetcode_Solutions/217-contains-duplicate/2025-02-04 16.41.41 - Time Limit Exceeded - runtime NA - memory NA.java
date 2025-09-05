class Solution {
    public boolean containsDuplicate(int[] nums) {
        int i = 0, j, k = 0;
        int[] c = new int[nums.length];
        boolean b = false;

        while (i < nums.length) 
        {
            j = i + 1;
            while (j < nums.length) 
            {
                if (nums[i] == nums[j]) 
                {
                    c[i]++;
                }
                j++;
            }
            i++;
        }

        i = 0;
        while (i < c.length) 
        {
            if (c[i] >= 1)
             {
                b = true;
                break;
            }
            i++;
        }

        return b;
    }
}
