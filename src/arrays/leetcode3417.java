package arrays;

import java.util.ArrayList;
import java.util.List;

public class leetcode3417
{
    public List<Integer> zigzagTraversal(int[][] grid) 
    {
        int i,j,count=0;
        i=0;
        j=0;
        List<Integer> ans=new ArrayList<>();
        while(count!=grid.length*grid[0].length)
        {
            if(i%2==0)
            {
                for(j=0;j<grid[0].length;j++)
                {
                    if(count%2==0)
                    {
                        ans.add(grid[i][j]);
                        count++;
                    }
                    else
                        count++;
                }
                i++;
            }
            else
            {
                j--;
                while(j!=-1)
                {
                    if(count%2==0)
                    {
                        System.out.println("row:"+i);
                        System.out.println("Column:"+j);
                        ans.add(grid[i][j]);
                        count++;
                        j--;
                    }
                    else
                    {
                        count++;
                        j--;
                    }
                }
                i++;
                j=0;
            }
        }
        return ans;
    }
    
}
