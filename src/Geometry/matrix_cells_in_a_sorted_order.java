package Geometry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class matrix_cells_in_a_sorted_order
{
    public static class points
    {
        int x;
        int y;
        points(int x,int y)
        {
            this.x=x;
            this.y=y;
        }
    }
    public static int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter)
    {
        HashMap<Integer, List<points>> map=new HashMap<>();
        int i,j;
        for(i=0;i<rows;i++)
        {
            for(j=0;j<cols;j++)
            {
                int dist=(int)Math.abs(i-rCenter)+(int)Math.abs(j-cCenter);
                points p=new points(i,j);
                p.x=i;
                p.y=j;
                if(map.containsKey(dist)==false)
                {
                    List<points> l=new ArrayList<>();
                    l.add(p);
                    map.put(dist,l);
                }
                else
                {
                    List<points> l=map.get(dist);
                    l.add(p);
                    map.put(dist,l);
                }
            }
        }
        List<Integer> a=new ArrayList<>();
        for(int key:map.keySet())
            a.add(key);
        Collections.sort(a);
        i=0;
        int c=0;
        int ans[][]=new int[rows*cols][2];
        while(i!=a.size())
        {
            List<points> l=map.get(a.get(i++));
            j=0;
            while(j!=l.size())
            {
                points p=l.get(j++);
                ans[c][0]=p.x;
                ans[c++][1]=p.y;
                // j++;
            }
        }
        return ans;
    }
    public static void print(int ans[][])
    {
        int i=0,j=0;
        for(i=0;i< ans.length;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        print(allCellsDistOrder(2,3,1,2));
    }
}
