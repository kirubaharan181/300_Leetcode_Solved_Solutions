class Solution {
    public int totalMoney(int n) {
        if(n<=7)
        {
            return n*(n+1)/2;
        }
        else
        {
            int s=n/7; 
            int m=n%7; 
            int sum=0;

            for(int i=1;i<=s;i++)
            {
                sum+=Sum(i,i+6);
            }
            sum+=Sum(s+1,s+m);
            return sum;
        } 
    }
    public int Sum(int s,int m)
    {
        return (m - s+1) * (s + m) / 2;   
    }
}