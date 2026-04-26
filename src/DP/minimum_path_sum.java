package DP;

public class minimum_path_sum 
{
    public static int minPathSum(int[][] grid) 
    {
        int i,j;
        for(i=0;i<grid.length;i++)
        {
            for(j=0;j<grid[0].length;j++)
            {
                if((i-1)>=0 && (j-1)>=0)
                    grid[i][j]=(int)Math.min(grid[i-1][j]+grid[i][j],grid[i][j-1]+grid[i][j]);
                else if((i-1)>=0)
                    grid[i][j]=grid[i][j]+grid[i-1][j];
                else if((j-1)>=0)
                    grid[i][j]=grid[i][j]+grid[i][j-1];
                // System.out.print(grid[i][j]+" ");
            }
            // System.out.println();
        }
        return grid[grid.length-1][grid[0].length-1];
    }
    public static int memo_solve(int i,int j,int dp[][],int grid[][])
    {
        if(i==0 && j==0)
            return grid[i][j];
        if(i<0 || j<0)
            return 200000;
        if(dp[i][j]!=-1)
            return dp[i][j];
        int up=memo_solve(i-1,j,dp,grid);
        int down=memo_solve(i,j-1,dp,grid);
        dp[i][j]=grid[i][j]+(int)Math.min(up,down);
        return dp[i][j];      
    }  
    public static void main(String[] args) 
    {
        int grid[][]={{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(minPathSum(grid));
        int grid2[][]={{1,3,1},{1,5,1},{4,2,1}};
        int dp[][]=new int[grid2.length][grid2[0].length];
        int i,j;
        for(i=0;i<grid2.length;i++)
        {
            for(j=0;j<grid2[0].length;j++)
            {
                dp[i][j]=-1;
            }
        }
        System.out.println(memo_solve(grid2.length-1,grid2[0].length-1,dp,grid2));
    }    
}
