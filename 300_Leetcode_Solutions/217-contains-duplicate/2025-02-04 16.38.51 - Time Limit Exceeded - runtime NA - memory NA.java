
class Solution 
{
    public boolean containsDuplicate(int[] nums) 
    {
        int i = 0, j = 0, k = 0;
        int[] c = new int[nums.length];
        boolean b = false;

        for (i = 0; i < nums.length; i++) 
        {
            for (j = i + 1; j < nums.length; j++) 
            {
                if (nums[i] == nums[j]) 
                {
                    c[i]++;
                }
            }
        }

        for (i = 0; i < c.length; i++) 
        {
            if (c[i] > 0) 
            {
                b = true;
                break;
            }
        }

        return b;
    }
}
