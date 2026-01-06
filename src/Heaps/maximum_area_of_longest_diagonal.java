package Heaps;
import java.util.*;
public class maximum_area_of_longest_diagonal
{
    public static class pair implements Comparable<pair>
    {
        double diagonal;
        int area;
        pair(double diagonal,int area)
        {
            this.diagonal=diagonal;
            this.area=area;
        }
        @Override
        public int compareTo(pair p)
        {
            if(this.diagonal!=p.diagonal)
                return Double.compare(this.diagonal,p.diagonal);
            return this.area-p.area;
        }
    }
    public static int areaOfMaxDiagonal(int[][] dimensions)
    {
        PriorityQueue<pair> pq=new PriorityQueue<>(Collections.reverseOrder());
        int i=0;
        while(i!=dimensions.length)
        {
            int length=dimensions[i][0];
            int breadth=dimensions[i][1];
            int area=length*breadth;
            double diagonal=Math.sqrt(length*length+breadth*breadth);
            pq.add(new pair(diagonal,area));
            i++;
        }
        return pq.remove().area;
    }
    public static void main(String[] args)
    {
        int dimensions[][]={{9,3},{8,6}};
        System.out.println(areaOfMaxDiagonal(dimensions));
    }
}
