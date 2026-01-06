package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class leetcode973 
{
    public static class Triplet implements Comparable<Triplet>
    {
        int dist;
        int x;
        int y;
        Triplet(int dist,int x,int y)
        {
            this.dist=dist;
            this.x=x;
            this.y=y;
        }
        public int compareTo(Triplet t)
        {
            return this.dist-t.dist;
        }
    }
    public static int[][] kClosest(int points[][],int k)
    {
        PriorityQueue<Triplet> pq=new PriorityQueue<>(Collections.reverseOrder());
        int i=0,distance;
        while(i!=points.length)
        {
            distance=points[i][0]*points[i][0]+points[i][1]*points[i][1];
            pq.add(new Triplet(distance, points[i][0],points[i][1]));
            if(pq.size()>k)
            pq.remove();
            i++;
        }
        i=0;
        int ans[][]=new int[k][2];
        while(pq.size()>0)
        {
            Triplet t=pq.remove();
            ans[i][0]=t.x;
            ans[i][1]=t.y;
            i++;
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
            System.out.println("");
        }
    }
    public static void main(String[] args) 
    {
        int  points[][] = {{1,3},{-2,2}}, k = 1;
        int ans2[][]=kClosest(points,k);
        print(ans2);
    }
}
