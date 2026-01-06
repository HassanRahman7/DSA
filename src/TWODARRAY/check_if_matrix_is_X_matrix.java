package TWODARRAY;

public class check_if_matrix_is_X_matrix
{
    public static boolean checkXMatrix(int[][] grid)
    {
        if(grid.length!=grid[0].length)
            return false;
        else
        {
            int i,j;
            for(i=0;i<grid.length;i++)
            {
                for(j=0;j<grid[0].length;j++)
                {
                    if(i==j || i+j==grid.length-1)
                    {
                        if(grid[i][j]==0)
                            return false;
                        else
                            continue;
                    }
                    else
                    {
                        if(grid[i][j]==0)
                            continue;
                        else
                            return false;
                    }
                }
            }
            return true;
        }
    }
    public static void main(String[] args)
    {
        int mat[][]={{2,0,0,1},{0,3,1,0},{0,5,2,0},{4,0,0,2}};
        System.out.println(checkXMatrix(mat));
    }
}
