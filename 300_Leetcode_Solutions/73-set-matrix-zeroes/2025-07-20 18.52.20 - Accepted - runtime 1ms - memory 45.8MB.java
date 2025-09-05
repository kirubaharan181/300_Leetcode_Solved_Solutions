class Solution {
    public void setZeroes(int[][] matrix) {
        int r=matrix.length,c=matrix[0].length;
        int[][] res=new int[r][c];

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                res[i][j]=matrix[i][j];
            }
        }

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(res[i][j]==0)
                {
                    setZero(matrix,i,j);
                }
            }
        }

    }

    public void setZero(int[][] matrix,int k,int m)
    {
        
        for(int i=0;i<matrix.length;i++)
        {
            matrix[i][m]=0;
        }
        for(int j=0;j<matrix[0].length;j++)
        {
            matrix[k][j]=0;
        }
        
    }
}