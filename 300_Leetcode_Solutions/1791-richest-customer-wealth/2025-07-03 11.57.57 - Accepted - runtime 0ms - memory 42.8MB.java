class Solution {
    public int maximumWealth(int[][] accounts) {
        int j=accounts[0].length,max=0;
        for(int i=0;i<accounts.length;i++)
        {
           int res=0,k=0;
           while(k<j)
           {
            res+=accounts[i][k++];
           } 
           max=Math.max(max,res);
        }
        return max;
    }
}