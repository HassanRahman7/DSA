package TWODARRAY;
import java.util.*;
public class Difference_btw_1s_and_0s_in_row_and_col
{
    public static int[][] onesMinusZeros(int[][] grid)
    {
        int i,j;
        HashMap<Integer,Integer> map_row_0=new HashMap<>();
        HashMap<Integer,Integer> map_col_0=new HashMap<>();
        HashMap<Integer,Integer> map_row_1=new HashMap<>();
        HashMap<Integer,Integer> map_col_1=new HashMap<>();
        for(i=0;i<grid.length;i++)
        {
            map_row_0.put(i,0);
            map_row_1.put(i,0);
        }
        for(j=0;j<grid[0].length;j++)
        {
            map_col_0.put(j,0);
            map_col_1.put(j,0);
        }
        for(i=0;i<grid.length;i++)
        {
            for(j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]==0)
                    map_row_0.put(i,map_row_0.get(i)+1);
                else
                    map_row_1.put(i,map_row_1.get(i)+1);
            }
        }
        for(j=0;j<grid[0].length;j++)
        {
            for(i=0;i<grid.length;i++)
            {
                if(grid[i][j]==0)
                    map_col_0.put(j,map_col_0.get(j)+1);
                else
                    map_col_1.put(j,map_col_1.get(j)+1);
            }
        }
        int ans[][]=new int[grid.length][grid[0].length];
        for(i=0;i<grid.length;i++)
        {
            for(j=0;j<grid[i].length;j++)
            {
                ans[i][j]=map_row_1.get(i)+map_col_1.get(j)-map_row_0.get(i)-map_col_0.get(j);
            }
        }
        return ans;
    }
    public static void print(int ans[][])
    {
        int i,j;
        for(i=0;i<ans.length;i++)
        {
            for(j=0;j<ans[0].length;j++)
            {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        int arr[][]={{0,1,1},{1,0,1},{0,0,1}};
        print(onesMinusZeros(arr));
    }
}
