class Solution {
    public int maxProfit(int[] prices) {
        int c=0,max=0;
        for(int i=1;i<prices.length;i++)
        {
            c=Math.max(0,c+=prices[i]-prices[i-1]);
            max=Math.max(c,max);
        }
        return max;
    }
}