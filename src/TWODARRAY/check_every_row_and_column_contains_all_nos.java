package TWODARRAY;
import java.util.*;
public class check_every_row_and_column_contains_all_nos
{
    public static boolean checksetcontainsall(HashSet<Integer> set, int n)
    {
        int i=1;
        while(i!=n+1)
        {
            if(set.contains(i++))
                continue;
            else
                return false;
        }
        return true;
    }
    public static boolean checkValid(int[][] matrix)
    {
        int i,j;
        HashSet<Integer> set=new HashSet<>();
        for(i=0;i<matrix.length;i++)
        {
            for(j=0;j<matrix[i].length;j++)
            {
                set.add(matrix[i][j]);
            }
            if(checksetcontainsall(set,matrix.length)==true)
                set.clear();
            else
                return false;
        }
        i=0;
        j=0;
        for(j=0;j<matrix.length;j++)
        {
            for(i=0;i<matrix.length;i++)
            {
                set.add(matrix[i][j]);
            }
            if(checksetcontainsall(set,matrix.length)==true)
                set.clear();
            else
                return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        int matrix[][]={{1,2,3},{3,1,2},{2,3,1}};
        System.out.println(checkValid(matrix));
    }
}
