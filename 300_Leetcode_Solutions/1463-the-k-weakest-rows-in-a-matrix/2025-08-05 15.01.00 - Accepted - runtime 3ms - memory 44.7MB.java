class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        List<int[]> l=new ArrayList<>();
        int c=0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                if(mat[i][j]==1)
                {
                    c++;
                }
            }
            l.add(new int[]{i,c});
            c=0;
        }
        Collections.sort(l, (a, b) -> {
            if (a[1] != b[1]) 
            {
                return a[1] - b[1];
            } 
            else 
            {
                return a[0] - b[0];
            }
        });
        int[] res = new int[k];
        for (int i = 0; i < k; i++) 
        {
            res[i] = l.get(i)[0];
        }
    return res;
    }
}