class Solution {
    public int countPrimes(int n) {
     if(n<=2) return 0; 
     int c=0;
     for(int i = 2; i < n; i++) 
     {
            boolean isPrime = true;
            for(int j = 2; j * j <= i; j++) 
            {
                if(i % j == 0) 
                {
                    isPrime = false;
                    break;
                }
            }
            c = isPrime ? c + 1 : c;
        }
     return c;   
    }
}