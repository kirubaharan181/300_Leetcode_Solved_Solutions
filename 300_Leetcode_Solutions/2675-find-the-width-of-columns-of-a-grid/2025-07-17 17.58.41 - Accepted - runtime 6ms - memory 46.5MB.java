class Solution {
    public int[] findColumnWidth(int[][] grid) {
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<grid[0].length;i++)
        {
            int max=0;
            for(int j=0;j<grid.length;j++)
            {
                max=Math.max(max,String.valueOf(grid[j][i]).length());
            }
            l.add(max);
        }
        int[] res=new int[l.size()];
        int a=0;
        for(int k:l)
        {
            res[a++]=k;
        }
        return res;
    }
}

