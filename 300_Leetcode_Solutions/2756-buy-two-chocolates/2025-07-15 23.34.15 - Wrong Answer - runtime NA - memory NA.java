class Solution {
    public int buyChoco(int[] prices, int money) {
        int sum=Arrays.stream(prices).sum();
        return sum>money*2?money:sum-money>=0?0:Math.abs(sum-money);
    }
}