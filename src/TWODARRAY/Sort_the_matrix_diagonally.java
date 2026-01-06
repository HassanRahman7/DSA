package TWODARRAY;
import java.util.*;
public class Sort_the_matrix_diagonally
{
    public static int[][] diagonalSort(int[][] mat)
    {
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        int i=0,j;
        for(i=0;i<mat.length;i++)
        {
            for(j=0;j<mat[i].length;j++)
            {
                if(map.containsKey(i-j)==false)
                {
                    List<Integer> arr=new ArrayList<>();
                    arr.add(mat[i][j]);
                    map.put(i-j,arr);
                }
                else
                {
                    List<Integer> arr=map.get(i-j);
                    arr.add(mat[i][j]);
                    map.put(i-j,arr);
                }
            }
        }
        HashMap<Integer,Integer> map2=new HashMap<>();
        for(int ele:map.keySet())
        {
            List<Integer> arr=map.get(ele);
            Collections.sort(arr);
            map.put(ele,arr);
            map2.put(ele,0);
        }
        for(i=0;i<mat.length;i++)
        {
            for(j=0;j<mat[i].length;j++)
            {
                int idx=map2.get(i-j);
                map2.put(i-j,idx+1);
                List<Integer> l=map.get(i-j);
                int ele=l.get(idx);
                mat[i][j]=ele;
            }
        }
        return mat;
    }
    public static void print(int ans[][])
    {
        int i,j;
        for(i=0;i<ans.length;i++)
        {
            for(j=0;j<ans[i].length;j++)
            {
                System.out.print(ans[i][j]+" ");
            }
        }
    }
    public static void main(String[] args)
    {
        int mat[][]={{3,3,1,1},{2,2,1,2},{1,1,1,2}};
        int ans[][]=diagonalSort(mat);
        print(ans);
    }

}
