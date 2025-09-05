class Solution {
    public boolean judgeSquareSum(int c) {
        long l=0;
        long r=(long)Math.sqrt(c);
        while(l<=r)
        {
            long k=l*l + r*r;
            if(k==c)
            {
                return true;
            }
            else if(k>c)
            {
                r--;
            }
            else
            {
                l++;
            }
        }
        return false;
    }
}