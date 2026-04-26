package Heaps;

import java.util.Collections;
import java.util.HashSet;
import java.util.PriorityQueue;

public class leetcode414 
{
    public static int thirdMax(int[] arr) 
    {
        HashSet<Integer> set=new HashSet<>();
        int i=0,ans;
        while(i!=arr.length)
            set.add(arr[i++]);
        PriorityQueue <Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int ele:set)
            pq.add(ele);
        if(set.size()<3)
            return pq.remove();
        ans=pq.remove();
        ans=pq.remove();
        ans=pq.remove();
        return ans;
    }
    public static void main(String[] args) 
    {
        int arr[]={2,2,3,1,34,45,6,};
        System.out.println(thirdMax(arr));
    }
}
