class Solution {
    public int numberOfMatches(int n) {
        int res=0;
            while(n>1)
            {   
                int s=n/2;
                res+=s;
                n = (n % 2 == 0) ? n / 2 : (n / 2) + 1;
            }
        return res;
    }
}