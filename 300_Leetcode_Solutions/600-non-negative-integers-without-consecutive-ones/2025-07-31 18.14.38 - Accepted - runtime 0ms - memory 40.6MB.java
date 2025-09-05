class Solution {
    public int findIntegers(int n) {
        int[] fib = new int[31];
        fib[0] = 1;
        fib[1] = 2;
        for (int i = 2; i < 31; i++) 
        {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        int count = 0;
        boolean pOne = false;
        
        for (int i = 30; i >= 0; i--) 
        {
            if ((n & (1 << i)) != 0)
            {
                count += fib[i];
                if (pOne) 
                {
                    return count;
                }
                pOne = true;
            } else 
            {
                pOne = false;
            }
        }
        return count + 1;
    }
}
