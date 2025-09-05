class Solution {
    public int findIntegers(int n) {
        int count = 0;
        for (int i = 0; i <= n; i++) 
        {
            if (!hasConsecutiveOnes(i)) 
            {
                count++;
            }
        }
        return count;
    }

    public boolean hasConsecutiveOnes(int k) 
    {
        return (k & (k << 1)) != 0;
    }
}
