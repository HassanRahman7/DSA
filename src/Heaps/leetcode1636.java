package Heaps;

import java.util.HashMap;
import java.util.PriorityQueue;

public class leetcode1636
{
        public static class Pair implements Comparable<Pair>
        {
            int ele;
            int freq;
            Pair(int ele,int freq)
            {
                this.ele=ele;
                this.freq=freq;
            }
            public int compareTo(Pair p)
            {
                if(this.freq==p.freq)
                    return p.ele-this.ele;
                return this.freq-p.freq;
            }
        }
        public static int[] frequencySort(int[] arr)
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
            for(int key:map.keySet())
                pq.add(new Pair(key,map.get(key)));
            int ans[]=new int[arr.length];
            int c=0;
            while(pq.size()>0)
            {
                Pair p=pq.remove();
                int ele=p.ele;
                int freq=p.freq;
                while(freq!=0)
                {
                    ans[c++]=ele;
                    freq--;
                }
            }
            return ans;
        }

    public static void main(String[] args)
    {
        int arr[]={-1,1,-6,4,5,-6,1,4,1};
        int ans[]=new int[arr.length];
        int i;
        ans=frequencySort(arr);
        for(i=0;i<arr.length;i++)
            System.out.print(ans[i]+" ");
    }
}
