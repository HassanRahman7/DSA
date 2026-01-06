package Hashmaps;

import java.util.HashMap;

//3160. Find the Number of Distinct Colors Among the Balls
//https://leetcode.com/problems/find-the-number-of-distinct-colors-among-the-balls/description/?envType=daily-question&envId=2025-02-07
public class leetcode3160 
{
    public static int[] queryResults(int limit, int[][] queries) 
    {
        HashMap<Integer,Integer> ColorMap=new HashMap<>(); // Color and times that color has appeared.
        HashMap<Integer,Integer> BallMap=new HashMap<>(); // Ball and the color of that particular ball.
        // List<Integer> ans=new ArrayList<>();
        int res[]=new int[queries.length];
        int i=0,n=queries.length;
        for(i=0;i<n;i++)
        {
            int ball=queries[i][0];
            int color=queries[i][1];
            if(BallMap.containsKey(ball)==false)
            {
                BallMap.put(ball,color);
                if(ColorMap.containsKey(color)==false)
                    ColorMap.put(color,1);
                else
                ColorMap.put(color,ColorMap.get(color)+1);
            }
            else
            {
                int oldcolor=BallMap.get(ball);
                ColorMap.put(oldcolor,ColorMap.get(oldcolor)-1);
                if(ColorMap.get(oldcolor)==0)
                ColorMap.remove(oldcolor);
                BallMap.put(ball,color);
                if(ColorMap.containsKey(color)==false)
                ColorMap.put(color,1);
                else
                ColorMap.put(color,ColorMap.get(color)+1);
            }
            res[i]=ColorMap.size();
        }
        return res;   
    }
    public static void main(String[] args) 
    {
        int queries[][]={{1,4},{2,5},{1,3},{3,4}};
        int limit=4;
        int ans[]=new int[queries.length];
        ans=queryResults(limit,queries);        
    }
    
}
