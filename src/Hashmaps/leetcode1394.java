package Hashmaps;

import java.util.HashMap;

public class leetcode1394 
{
    public static int findLucky(int[] arr) 
    {
        int i=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(i!=arr.length)
        {
            if(map.containsKey(arr[i])==false)
                map.put(arr[i],1);
            else
                map.put(arr[i],map.get(arr[i])+1);
            i++;
        }
        int ans=-1;
        for(Integer key:map.keySet())
        {
            if(key==map.get(key))
            ans=key;
        }
        return ans;
    }
    public static void main(String[] args) 
    {
        int arr[]={2,2,2,3,3};
        System.out.println(findLucky(arr));
        
    }

    
}
