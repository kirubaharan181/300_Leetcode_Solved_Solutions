import java.util.Arrays;

class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) 
        {
            return 0; 
        }

        int min = Arrays.stream(prices).min().orElse(0);
        int max = Arrays.stream(prices).max().orElse(0);

        int index1 = Arrays.binarySearch(prices, min);
        int index2 = Arrays.binarySearch(prices, max);

        
        if (index1 < index2) 
        {
            return max - min; 
        } else 
        {
            return 0; 
        }
    }
}