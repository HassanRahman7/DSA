package Heaps;

import java.util.HashMap;
import java.util.PriorityQueue;
// https://leetcode.com/problems/top-k-frequent-elements/description/
public class leetcode347
{
    public static class Pair implements Comparable<Pair>
    {
        int ele;
        int freq;
        Pair(int ele, int freq)
        {
            this.ele=ele;
            this.freq=freq;
        }
        public int compareTo(Pair p)
        {
            return this.freq-p.freq;
        }
    }
    public static int[] topKfrequent(int arr[],int k)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        int i=0;
        while(i!=arr.length)
        {
            if(map.containsKey(arr[i])==false)
                map.put(arr[i],1);
            else
                map.put(arr[i],map.get(arr[i])+1);
            i++;
        }
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        for(int key: map.keySet())
        {
            pq.add(new Pair(key,map.get(key)));
            if(pq.size()>k)
                pq.remove();
        }
        int ans[]=new int[k];
        int c=0;
        while(pq.size()>0)
        {
            Pair p=pq.remove();
            ans[c++]=p.ele;
        }
        return ans;
    }

    public static void main(String[] args)
    {
        int arr[]={1,1,1,2,2,3},k=2;
        int ans[]=new int[k];
        ans=topKfrequent(arr,k);
        int i;
        for(i=0;i<ans.length;i++)
            System.out.print(ans[i]+" ");

    }
}
