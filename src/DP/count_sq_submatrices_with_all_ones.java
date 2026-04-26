package DP;

public class count_sq_submatrices_with_all_ones 
{
    public static int countSquares(int[][] matrix) 
    {
        int i,j;
        for(i=0;i<matrix.length;i++)
        {
            for(j=0;j<matrix[0].length;j++)
            {
                if((i-1)<0 || (j-1)<0)
                    continue;
                else
                {
                    if(matrix[i][j]==1)
                    {
                        if(matrix[i-1][j]>0)
                        {
                            if(matrix[i][j-1]>0)
                            {
                                if(matrix[i-1][j-1]>0)
                                    matrix[i][j]=(int)Math.min(matrix[i-1][j],(int)Math.min(matrix[i][j-1],matrix[i-1][j-1]))+1;
                            }
                        }
                    }
                }
            }
        }
        int ans=0;
        for(i=0;i<matrix.length;i++)
        {
            for(j=0;j<matrix[0].length;j++)
                ans=ans+matrix[i][j];
        }
        return ans;
    }
    public static void main(String[] args) 
    {
        int matrix[][]={{0,1,1,1},{1,1,1,1},{0,1,1,1}};
        System.out.println(countSquares(matrix));
    }
    
}
