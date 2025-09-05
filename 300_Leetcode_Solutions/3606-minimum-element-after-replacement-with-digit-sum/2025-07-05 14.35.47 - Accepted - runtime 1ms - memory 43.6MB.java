class Solution {
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int k:nums)
        {
            int sum=0;
            for(int n=k;n>0;sum+=n%10,n/=10);
            min=Math.min(min,sum);
        }
        return min;
    }
}