class Solution 
{
    public int countPrimes(int n) 
    {
        if (n <= 2) 
        {
            return 0;
        }

        int count = 1;

        for (int i = 3; i < n; i += 2) 
        {
            if (isPrime(i)) 
            {
                count++;
            }
        }

        return count;
    }

    public boolean isPrime(int num) 
    {
        for (int i = 2; i * i <= num; i++) 
        {
            if (num % i == 0) 
            {
                return false;
            }
        }

        return true;
    }
}
