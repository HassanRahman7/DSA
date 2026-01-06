package Hashmaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class leetcode1726 
{
    public int tupleSameProduct(int[] arr) 
    {
        List<Integer> prod_array=new ArrayList<>();
        int i=0,j=1;
        while(i!=arr.length-1)
        {
            while(j!=arr.length)
                prod_array.add(arr[i]*arr[j++]);
            i++;
            j=i+1;
        }
        // System.out.println(prod_array);
        // now I will make a hashmap of this prod_array
        HashMap <Integer,Integer> map=new HashMap<>();
        i=0;
        while(i!=prod_array.size())
        {
            if(map.containsKey(prod_array.get(i))==true)
            {
                int freq=map.get(prod_array.get(i));
                map.put(prod_array.get(i++),freq+1);
            }
            else
                map.put(prod_array.get(i++),1);
        }
        // System.out.println(map);
        int c=0;
        for(int val:map.values())
            c=c+((val*(val-1))*4);
        return c;
    }
    
}
