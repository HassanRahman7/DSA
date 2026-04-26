package DP;
//https://leetcode.com/problems/cherry-pickup/?utm=codolio
public class CherryPickup 
{
    public static int helper(int r1,int c1,int r2,int c2,int grid[][],int dp[][][][])
    {
        if(r1>=grid.length || r2>=grid.length || c1>=grid[0].length || c2>=grid[0].length || grid[r1][c1]==-1 || grid[r2][c2]==-1)
            return Integer.MIN_VALUE;
        if(dp[r1][c1][r2][c2]!=-1)
            return dp[r1][c1][r2][c2];
        int val1=grid[r1][c1];
        int val2=grid[r2][c2];
        int cheeries=0;
        if(r1==r2 && c1==c2)
        {
            cheeries=cheeries+grid[r1][c1];
            if(r1==grid.length-1 && c1==grid.length-1)
            {
                dp[r1][c1][r2][c2]=grid[r1][c1];
                return dp[r1][c1][r2][c2];
            }
            grid[r1][c1]=0;
        }
        else
        {
            cheeries=cheeries+grid[r1][c1]+grid[r2][c2];
            grid[r1][c1]=0;
            grid[r2][c2]=0;
        }
        int p1=helper(r1+1,c1,r2+1,c2,grid,dp);
        int p2=helper(r1+1,c1,r2,c2+1,grid,dp);
        int p3=helper(r1,c1+1,r2,c2+1,grid,dp);
        int p4=helper(r1,c1+1,r2+1,c2,grid,dp);
        grid[r1][c1]=val1;
        grid[r2][c2]=val2;
        dp[r1][c1][r2][c2]=cheeries+(int)Math.max((int)Math.max(p1,p2),(int)Math.max(p3,p4));
        return dp[r1][c1][r2][c2];
    }
    public static int cherryPickup(int[][] grid) 
    {
        int i,j,k,l;
        int dp[][][][]=new int[grid.length][50][50][50];
        for(i=0;i<dp.length;i++)
        {
            for(j=0;j<dp[0].length;j++)
            {
                for(k=0;k<dp[0][0].length;k++)
                {
                    for(l=0;l<dp[0][0][0].length;l++)
                    {
                        dp[i][j][k][l]=-1;
                    }
                }
            }
        }
        int ans=helper(0,0,0,0,grid,dp);
        if(ans<0)
            return 0;
        else
            return ans;
    }
    public static void main(String[] args) 
    {
        int grid[][]={{0,1,-1},{1,0,-1},{1,1,1}};
        System.out.println(cherryPickup(grid));       
    }    
}
