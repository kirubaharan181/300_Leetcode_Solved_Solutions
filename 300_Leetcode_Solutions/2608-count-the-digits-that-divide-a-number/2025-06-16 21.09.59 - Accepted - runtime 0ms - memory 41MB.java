class Solution {
    public int countDigits(int num) {
        int c = 0;
        int k = num;
        while (num > 0) 
        {
            int t = num % 10;
            if (k % t == 0) 
            {
                c++;
            }
            num /= 10;
        }
        return c;
    }
}