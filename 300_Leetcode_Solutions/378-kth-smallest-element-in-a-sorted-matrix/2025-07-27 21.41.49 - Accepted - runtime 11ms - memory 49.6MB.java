class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int r=matrix.length;
        int c=matrix[0].length;
        if(r==1 && c==1 ) return matrix[0][0];
        int n= r * r;
        int[] res=new int[n];
        int m=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                res[m++]=matrix[i][j];
            }
        }
        Arrays.sort(res);
        return res[k-1];
    }
}