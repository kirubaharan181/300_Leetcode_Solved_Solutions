class Solution {
    public int countDigitOne(int n) {
        int res=0;
       for(int i=1;i<=n;i++)
       {
            res+=count(i);
       } 
       return res;
    }
    public int count(int k)
    {
        int c=0;
        while(k>0)
        {
            int t=k%10;
            k/=10;
            if(t==1)
            {
                c++;
            }
        }
        return c;
    }
}