package TWODARRAY;
import java.util.*;
public class first_completely_painted_row_or_col
{
    public static class pair
    {
        int i;
        int j;
        pair(int i,int j)
        {
            this.i=i;
            this.j=j;
        }
    }
    public int firstCompleteIndex(int[] arr, int[][] mat)
    {
        HashMap<Integer,pair> map=new HashMap<>();
        int i=0;
        int j=0;
        for(i=0;i<mat.length;i++)
        {
            for(j=0;j<mat[0].length;j++)
            {
                map.put(mat[i][j],new pair(i,j));
            }
        }
        HashMap<Integer,Integer> rows=new HashMap<>();
        i=0;
        HashMap<Integer,Integer> cols=new HashMap<>();
        while(i!=mat.length)
            rows.put(i++,0);
        j=0;
        while(j!=mat[0].length)
            cols.put(j++,0);
        i=0;
        int row_no,col_no;
        int max_ele_in_rows=mat[0].length,max_ele_in_cols=mat.length;
        while(i!=arr.length)
        {
            pair p=map.get(arr[i]);
            row_no=p.i;
            col_no=p.j;
            rows.put(row_no,rows.get(row_no)+1);
            if(rows.get(row_no)==max_ele_in_rows)
                return i;
            cols.put(col_no,cols.get(col_no)+1);
            if(cols.get(col_no)==max_ele_in_cols)
                return i;
            i++;
        }
        return -1;
    }
    public static void main(String[] args)
    {

    }
}
