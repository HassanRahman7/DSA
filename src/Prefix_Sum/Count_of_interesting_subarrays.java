package Prefix_Sum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Count_of_interesting_subarrays
{
    public static long countInterestingSubarrays(List<Integer> arr, int m, int k)
    {
        int i=0;
        while(i!=arr.size())
        {
            if(arr.get(i)%m==k)
                arr.set(i,1);
            else
                arr.set(i,0);
            i++;
        }
        int pre[]=new int[arr.size()];
        i=1;
        pre[0]=arr.get(0);
        while(i!=arr.size())
            pre[i]=pre[i-1]+arr.get(i++);
        HashMap<Long,Long> map=new HashMap<>();
        map.put((long)0,(long)1);
        long counter=0;
        i=0;
        while(i!=arr.size())
        {
            long remainder1=(long)(pre[i]%m);
            long remainder2=(long)((remainder1-k+m)%m);
            if(map.containsKey(remainder2)==true)
                counter=counter+map.get(remainder2);
            if(map.containsKey(remainder1)==false)
                map.put(remainder1,(long)1);
            else
                map.put(remainder1,map.get(remainder1)+1);
            i++;
        }
        return counter;
    }
    public static void main(String[] args)
    {
        List<Integer> nums=new ArrayList<>();
        nums.add(3);
        nums.add(2);
        nums.add(4);
        int m=2;
        int k=1;
        System.out.println(countInterestingSubarrays(nums,m,k));
    }
}
