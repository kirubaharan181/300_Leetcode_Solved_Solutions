class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int r = grid.length, c = grid[0].length;
        int[][] res = new int[r][c];
        int[] rowOne = new int[r];
        int[] colOne = new int[c];
        int[] rowZero = new int[r];
        int[] colZero = new int[c];

        for (int i = 0; i < r; i++) 
        {
            for (int j = 0; j < c; j++) 
            {
                if (grid[i][j] == 1) 
                {
                    rowOne[i]++;
                    colOne[j]++;
                }
                else
                {
                    rowZero[i]++;
                    colZero[j]++;
                }
            }
        }

        for (int i = 0; i < r; i++) 
        {
            for (int j = 0; j < c; j++) 
            {
                res[i][j] = rowOne[i] + colOne[j] - rowZero[i] - colZero[j];
            }
        }
        return res;
    }
}