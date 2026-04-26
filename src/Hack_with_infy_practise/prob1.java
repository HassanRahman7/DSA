package Hack_with_infy_practise;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
public class prob1 
{
    public static int solve(int N,int arr[])
    {
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        HashSet<Integer> set=new HashSet<>();
        int i=0;
        while(i!=arr.length)
        {
            set.add(arr[i]);
            if(map.containsKey(arr[i])==false)
            {
                List<Integer> l=new ArrayList<>();
                l.add(i);
                map.put(arr[i],l);
            }
            else
            {
                List<Integer> l=map.get(arr[i]);
                l.add(i);
                map.put(arr[i],l);
            }
            i++;
        }
        // int ans=0;
        HashMap<Integer,Integer> map2=new HashMap<>();
        for(int ele:set)
        {
            List<Integer> l=map.get(ele);
            i=0;
            int c=0,last_picked=-2;
            while(i!=l.size())
            {
                
                if((last_picked+1)<l.get(i))
                {
                    c++;
                    last_picked=l.get(i);
                }
                i++;
            }
            map2.put(ele,c);
        }
        int ans=Integer.MIN_VALUE;
        int pos_ans=-1;
        for(int key:map2.keySet())
        {
            if(ans<map2.get(key))
            {
                ans=map2.get(key);
                pos_ans=key;
            }
        }
        return pos_ans;
    }
    public static void main(String[] args) 
    {
        int arr[]={1,2,2,1,2,1,1,1,1};
        System.out.println(solve(9,arr));
    }
}
