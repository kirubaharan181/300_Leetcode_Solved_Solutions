class Solution {
     public static int divide(int dividend, int divisor) {
        int res = dividend / divisor;
        double res1 = Math.floor(res);
        return (int) res1;
    }
}
 