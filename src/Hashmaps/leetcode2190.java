package Hashmaps;

import java.util.HashMap;
import java.util.HashSet;

public class leetcode2190
{
    public static int mostFrequent(int[] arr, int key)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        HashSet<Integer> set=new HashSet<>();
        int i=0;
        while(i!=arr.length)
            set.add(arr[i++]);
        i=0;
        for(int ele:set)
            map.put(ele,0);
        while(i!=arr.length-1)
        {
            if(arr[i]==key)
                map.put(arr[i+1],map.get(arr[i+1])+1);
            i++;
        }
        int max=0,posans=2;
        for(int key2:map.keySet())
        {
            if(map.get(key2)>max)
            {
                max=map.get(key2);
                posans=key2;
            }
        }
        return posans;
    }

    public static void main(String[] args)
    {
        int arr[]={1,100,200,1,100},key=1;
        System.out.println(mostFrequent(arr,key));
    }
}
