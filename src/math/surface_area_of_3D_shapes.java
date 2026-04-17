package math;

public class surface_area_of_3D_shapes 
{
    public static int surfaceArea(int[][] grid) 
    {
        int i=0,j;
        int total_area=0;
        for(i=0;i<grid.length;i++)
        {
            for(j=0;j<grid.length;j++)
            {
                if(grid[i][j]>0)
                {
                    total_area=total_area+2;
                    if(((i-1)>=0)==false)
                        total_area=total_area+grid[i][j];
                    else
                    {
                        if(grid[i][j]<=grid[i-1][j])
                            ;
                        else
                            total_area=total_area+grid[i][j]-grid[i-1][j];
                    }
                    if((i+1)>=grid.length)
                        total_area=total_area+grid[i][j];
                    else
                    {
                        if(grid[i][j]<=grid[i+1][j])
                            ;
                        else
                            total_area=total_area+grid[i][j]-grid[i+1][j];  
                    }
                    if(((j-1)>=0)==false)
                        total_area=total_area+grid[i][j];
                    else
                    {
                        if(grid[i][j]<=grid[i][j-1])
                            ;
                        else
                            total_area=total_area+grid[i][j]-grid[i][j-1];
                    }
                    if((j+1)>=grid.length)
                        total_area=total_area+grid[i][j];
                    else
                    {
                        if(grid[i][j]<=grid[i][j+1])
                            ;
                        else
                            total_area=total_area+grid[i][j]-grid[i][j+1];
                    }
                    // System.out.print(total_area+" ");
                }
                else
                    continue;
            }
        }
        return total_area;
    }
    public static void main(String[] args) 
    {
        int grid[][]={{2,2,2},{2,1,2},{2,2,2}};
        System.out.println(surfaceArea(grid));
    }    
}
