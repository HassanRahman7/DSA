package Sorting;
import java.util.*;
public class Most_Beautiful_Item_for_each_query
{
    public static void sortbyColumn(int items[][],int column)
    {
        Arrays.sort(items,(x,y)-> Integer.compare(x[column],y[column]));
    }
    public static int[] maximumBeauty(int[][] items, int[] queries)
    {
        int i=0,j;
        sortbyColumn(items,0);
        int req[]=new int[items.length];
        req[0]=items[0][1];
        i=1;
        while(i!=req.length)
            req[i]=(int)Math.max(req[i-1],items[i++][1]);
        i=0;
        while(i!=items.length)
            items[i][1]=req[i++];
        HashMap<Integer,Integer> map=new HashMap<>();
        i=0;
        while(i!=items.length)
        {
            if(map.containsKey(items[i][0])==false)
                map.put(items[i][0],items[i][1]);
            else
            {
                if(map.get(items[i][0])<items[i][1])
                    map.put(items[i][0],items[i][1]);
            }
            i++;
        }
        // System.out.println(map);
        Integer keys[]=map.keySet().toArray(new Integer[0]);
        // System.out.println(keys);
        // Integer keysint[]=keys.toArray(new Integer[0]);
        int mid=0,lo=0,hi=keys.length-1;
        i=0;
        int ans[]=new int[queries.length];
        Arrays.sort(keys);
        // int c=0;
        while(i!=queries.length)
        {
            int target=queries[i];
            lo=0;
            hi=keys.length-1;
            int ans2=0;
            boolean found=false;
            while(lo<=hi)
            {
                mid=lo+(hi-lo)/2;
                if(keys[mid]<=target)
                {
                    ans2=(int)(Math.max(ans2,map.get(keys[mid])));
                    lo=mid+1;
                }
                else
                    hi=mid-1;
            }
            ans[i++]=ans2;
            ans2=0;
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
        int items[][]={{10,1000}};
        int queries[]={5};
        int ans[]=maximumBeauty(items,queries);
        print(ans);
    }
}
