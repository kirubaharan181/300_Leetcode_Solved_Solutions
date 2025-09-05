class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int r=matrix.length;
        int c=matrix[0].length;
        if(r==1 && c==1 ) return matrix[0][0];
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                l.add(matrix[i][j]);
            }
        }
        Collections.sort(l);
        return l.get(k-1);
    }
}