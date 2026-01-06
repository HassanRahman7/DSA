package Heaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class leetcode658
{
    public static class Pair implements Comparable<Pair>
    {
        int ele;
        int diff;
        Pair(int ele,int diff)
        {
            this.ele=ele;
            this.diff=diff;
        }
        public int compareTo(Pair p)
        {
            if(this.diff==p.diff)
                return this.ele-p.ele;
            return this.diff-p.diff;
        }
    }
    public static List<Integer> findClosestElements(int arr[], int k, int x)
    {
        PriorityQueue<Pair> pq=new PriorityQueue<>(Collections.reverseOrder());
        int i=0;
        while(i!=arr.length)
        {
            pq.add(new Pair(arr[i],(int)Math.abs(arr[i]-x)));
            if(pq.size()>k)
                pq.remove();
            i++;
        }
        List<Integer> ans=new ArrayList<>();
        while(pq.size()!=0)
        {
            Pair p=pq.remove();
            ans.add(p.ele);
        }
        Collections.sort(ans);
        return ans;
    }

    public static void main(String[] args)
    {
       int arr[]={1,2,3,4,5},k=4,x=3;
        System.out.println(findClosestElements(arr,k,x));
    }
}
