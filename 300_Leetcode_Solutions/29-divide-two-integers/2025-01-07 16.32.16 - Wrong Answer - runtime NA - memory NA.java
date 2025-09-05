class Solution {
    public int divide(int dividend, int divisor) {
        int n = dividend / divisor;
        int s = (int) Math.ceil((double) n);
        return s;
    }
}
