class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        List<Integer> l=Arrays.stream(nums).boxed().collect(Collectors.toList());
        for(int k:l)
        {
            int s=Collections.frequency(l,k);
            if(isPrime(s))
            {
                return true;
            }
        }
        return false;
        
    }
    public boolean isPrime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        else
        {
            for(int i=2;i*i<=n;i++)
            {
                if(n%i==0)
                {
                    return false;
                }
            }
            return true;
        }
    }
}