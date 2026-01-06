package TWODARRAY;
import java.util.*;
public class Diagonal_traverse
{
    public static int[] findDiagonalOrder(int[][] mat)
    {
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        int i=0;
        int j=0;
        for(i=0;i<mat.length;i++)
        {
            for(j=0;j<mat[i].length;j++)
            {
                if(map.containsKey(i+j)==false)
                {
                    List<Integer> l=new ArrayList<>();
                    l.add(mat[i][j]);
                    map.put(i+j,l);
                }
                else
                {
                    List<Integer> l2=map.get(i+j);
                    l2.add(mat[i][j]);
                    map.put(i+j,l2);
                }
            }
        }
        // System.out.println(map);
        int ans[]=new int[mat.length*mat[0].length];
        for(int ele:map.keySet())
        {
            if(ele%2==0)
            {
                List<Integer> l=map.get(ele);
                i=0;
                j=l.size()-1;
                int temp;
                while(i<=j)
                {
                    temp=l.get(i);
                    l.set(i,l.get(j));
                    l.set(j,temp);
                    i++;
                    j--;
                }
            }
            else
                continue;
        }
        // System.out.println(map.keySet());
        // int arr[]=Arrays.sort(map.keySet().toArray());
        Integer arr[]=map.keySet().toArray(new Integer[0]);
        Arrays.sort(arr);
        i=0;
        int c=0;
        while(i!=arr.length)
        {
            int key=arr[i];
            List<Integer> l=map.get(key);
            int idx=0;
            while(idx!=l.size())
                ans[c++]=l.get(idx++);
            i++;
        }
        return ans;
    }
    public static void print(int ans[])
    {
        int i=0;
        while(i!=ans.length)
            System.out.print(ans[i++]+" ");
    }
    public static void main(String[] args)
    {
        int mat[][]={{1,2,3},{4,5,6},{7,8,9}};
        int ans[]=findDiagonalOrder(mat);
        print(ans);
    }
}
