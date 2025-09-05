class Solution {
    public int countNegatives(int[][] grid) {
        int c=0,row=grid.length,col=grid[0].length;
        for(int i=0;i<row*col;i++)
        {
            int r1=i/col;
            int c1=i%col;
            if(grid[r1][c1]<0)
            {
                c++;
            }
        }
        return c;
    }
}