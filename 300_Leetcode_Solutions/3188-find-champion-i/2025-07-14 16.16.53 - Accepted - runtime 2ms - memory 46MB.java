class Solution {
    public int findChampion(int[][] grid) {
        int max=0,res=0;
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<grid.length;i++)
        {
            int sum=0;
            for(int j=0;j<grid[0].length;j++)
            {
                sum+=grid[i][j];
            }
            l.add(sum);
        }
        int k=Collections.max(l);
        return l.indexOf(k);
    }
}