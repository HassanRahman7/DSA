package arrays;


import java.util.ArrayList;
import java.util.List;

class leetcode1779
{
    public static int nearestValidPoint(int x, int y, int[][] points) 
    {
        int i=0,ans=Integer.MAX_VALUE;
        List<Integer> val_points=new ArrayList<>();
        while(i!=points.length)
        {
            if(points[i][0]==x||points[i][1]==y)
                val_points.add(i);
            i++;
        }
        if(val_points.size()==0)
        return -1;
        else
        {
            System.out.println(val_points);
            int dist,ansdist=Integer.MAX_VALUE;
            i=0;
            while(i!=val_points.size())
            {
                int index=val_points.get(i);
                int x1=points[index][0];
                int y1=points[index][1];
                dist=Math.abs(x1-x)+Math.abs(y1-y);
                if(dist<ansdist)
                {
                    ansdist=dist;
                    ans=index;
                }
                i++;
            }
            return ans;
        }
   }
   public static void main(String[] args) 
   {
        int x=3,y=4,points[][]={{2,3}};
        System.out.println(nearestValidPoint(x,y,points));
   }
}