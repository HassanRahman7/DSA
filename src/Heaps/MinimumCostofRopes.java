package Heaps;

import java.util.PriorityQueue;
//http://geeksforgeeks.org/problems/minimum-cost-of-ropes-1587115620/1
public class MinimumCostofRopes
{
    public static int minCost(int[] arr)
    {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int i=0;
        while(i!=arr.length)
            pq.add(arr[i++]);
        int cost=0,fr,sr;
        while(pq.size()>1)
        {
            fr=pq.remove();
            sr=pq.remove();
            pq.add(fr+sr);
            cost=cost+fr+sr;
        }
        return cost;
    }
    public static void main(String[] args)
    {
        int arr[]={10};
        System.out.println(minCost(arr));

    }
}
