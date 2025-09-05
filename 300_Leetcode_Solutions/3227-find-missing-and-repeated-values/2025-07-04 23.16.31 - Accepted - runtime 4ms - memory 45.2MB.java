class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        Set<Integer> st = new HashSet<>();
        int[] res = new int[2];
        int n = grid.length;
        int sum = 0;
        
        int tot = n * n * (n * n + 1) / 2;
        for (int i = 0; i<n; i++) 
        {
            for (int j=0; j<grid[0].length; j++)
             {
                sum += grid[i][j];
                if (!st.add(grid[i][j])) 
                {
                    res[0] = grid[i][j];
                }
            }
        }
        res[1] = tot-(sum - res[0]); 
        return res;
    }
}