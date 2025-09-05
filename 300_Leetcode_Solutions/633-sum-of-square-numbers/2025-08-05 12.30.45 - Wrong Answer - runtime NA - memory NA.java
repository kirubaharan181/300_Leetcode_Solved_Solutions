class Solution {
    public boolean judgeSquareSum(int c) {
        int l=0;
        int r=(int)Math.sqrt(c);
        while(l<=r)
        {
            if((l*l + r*r)==c)
            {
                return true;
            }
            else if((l*l +r*r)>c)
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