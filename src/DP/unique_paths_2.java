package DP;

public class unique_paths_2 
{
    public static int uniquePathsWithObstacles(int[][] grid) 
    {
        if(grid[0][0]==1 || grid[grid.length-1][grid[0].length-1]==1)
            return 0;
        else
        {
            int i,j;
            grid[0][0]=1;
            for(i=0;i<grid.length;i++)
            {
                for(j=0;j<grid[0].length;j++)
                {
                    if(i==0 && j==0)
                        continue;
                    if(grid[i][j]==1)
                        grid[i][j]=-1;       
                }
            }
            // print(grid);
            // System.out.println();
            i=1;
            boolean c1=false;
            while(i!=grid.length)
            {
                if(grid[i][0]==-1)
                    c1=true;
                if(c1==true)
                    grid[i][0]=-1;
                if(c1==false)
                    grid[i][0]=1;
                i++;
            }   
            c1=false;
            i=1;
            while(i!=grid[0].length)
            {
                if(grid[0][i]==-1)
                    c1=true;
                if(c1==true)
                    grid[0][i]=-1;
                if(c1==false)
                    grid[0][i]=1;
                i++;
            }
            for(i=1;i<grid.length;i++)
            {
                for(j=1;j<grid[0].length;j++)
                {
                    if(grid[i][j]==-1)
                        continue;
                    else
                    {
                        if(grid[i-1][j]==-1 || grid[i][j-1]==-1)
                            grid[i][j]=grid[i][j]+(int)Math.max(grid[i-1][j],grid[i][j-1]);
                        else
                            grid[i][j]=grid[i-1][j]+grid[i][j-1];
                    }
                }
            }
            if(grid[grid.length-1][grid[0].length-1]==-1)
                return 0;
            // print(grid);
            return grid[grid.length-1][grid[0].length-1];
        }
    }   
    public static void main(String[] args) 
    {
        int grid[][]={{0}};
        System.out.println(uniquePathsWithObstacles(grid));   
    }
}
