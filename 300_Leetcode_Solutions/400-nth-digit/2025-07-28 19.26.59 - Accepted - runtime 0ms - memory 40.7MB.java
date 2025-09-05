class Solution {
    public int findNthDigit(int n) {
        if (n <= 9) return n;
        int len = 1;
        long count = 9;
        long start = 1;

        while (n>len * count) 
        {
            n-=len * count;
            len++;
            count*= 10;
            start*= 10;
        }

        long num =start +(n - 1)/len;
        int res =(n - 1)%len;

        return String.valueOf(num).charAt(res) - '0';
    }
}