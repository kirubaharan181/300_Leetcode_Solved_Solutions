class Solution {
    public int countPrimes(int n) {
     if(n<=2) return 0; 
     int c=1;
     for(int i=3;i<n;i+=2)
     {
        if(n%i!=0)
        {
            System.out.println(i);
            c++;
        }
     }
     return c;   
    }
}