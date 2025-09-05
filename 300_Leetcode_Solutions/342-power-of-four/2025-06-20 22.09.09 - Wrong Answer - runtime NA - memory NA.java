class Solution {
    public boolean isPowerOfFour(int n) {
         if(n==1)
        {
            return true;
        }
        if(n==0||n%2!=0)
        {
            return false;
        }
        return isPowerOfFour(n/4);
    }
}