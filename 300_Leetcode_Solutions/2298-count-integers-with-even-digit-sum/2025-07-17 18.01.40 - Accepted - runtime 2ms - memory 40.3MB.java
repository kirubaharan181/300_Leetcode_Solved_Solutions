class Solution {
    public int countEven(int num) {
        int c = 0;
        for (int i=1;i<=num;i++) 
        {
            int sum=0, k=i;
            while (k>0) 
            {
                sum+=k%10;
                k/=10;
            }
            if(sum%2==0) 
            {
                c++;
            }
        }
        return c;
    }
}