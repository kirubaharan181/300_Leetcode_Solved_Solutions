class Solution {
    public int arrangeCoins(int n) {
       int c=0;
       for(int i=1;i<=n;i++)
       {
            if(n<i) break;
            n-=i;
            c++;
       }
       return c;
    }
}