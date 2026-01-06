package TWODARRAY;
import java.util.*;
public class special_pos_in_a_binary_matrix
{
    public static int numSpecial(int[][] mat)
    {
        int i,j;
        HashMap<Integer,Integer> map_row=new HashMap<>();
        HashMap<Integer,Integer> map_col=new HashMap<>();
        for(i=0;i<mat.length;i++)
            map_row.put(i,0);
        for(j=0;j<mat[0].length;j++)
            map_col.put(j,0);
        for(i=0;i<mat.length;i++)
        {
            for(j=0;j<mat[0].length;j++)
            {
                if(mat[i][j]==1)
                {
                    map_row.put(i,map_row.get(i)+1);
                    map_col.put(j,map_col.get(j)+1);
                }
                else
                    continue;
            }
        }
        int ans=0;
        for(i=0;i<mat.length;i++)
        {
            for(j=0;j<mat[0].length;j++)
            {
                if(mat[i][j]==1)
                {
                    if(map_row.get(i)==1 && map_col.get(j)==1)
                        ans++;
                    else
                        continue;
                }
                else
                    continue;
            }
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int map[][]={{1,0,0},{0,0,1},{1,0,0}};
        System.out.println(numSpecial(map));
    }
}
