package Prefix_Sum;

public class grid_game
{
    public static long gridGame(int[][] grid)
    {
        long first_row_sum=0;
        int i=0;
        for(i=0;i<grid[0].length;i++)
            first_row_sum=first_row_sum+(long)grid[0][i];
        long second_row_sum=0;
        long ans=Long.MAX_VALUE;
        for(i=0;i<grid[0].length;i++)
        {
            first_row_sum=first_row_sum-grid[0][i];
            long posans=(long)Math.max(first_row_sum,second_row_sum);
            ans=(long)Math.min(ans,posans);
            second_row_sum=second_row_sum+grid[1][i];
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int grid[][]={{1,3,1,15},{1,3,3,1}};
        System.out.println(gridGame(grid));
    }
}
