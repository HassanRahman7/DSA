package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class last_stone_weight
{
    public static int lastStoneWeight(int[] arr)
    {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        int i=0;
        while(i!=arr.length)
            pq.add(arr[i++]);
        while(pq.size()>1)
        {
            int fs=pq.remove();
            int ss=pq.remove();
            if(fs==ss)
                continue;
            else
                pq.add((int)Math.abs(fs-ss));
        }
        if(pq.size()==0)
            return 0;
        return pq.remove();
    }

    public static void main(String[] args)
    {
        int stones[]={2,7,4,1,8,1};
        System.out.println(lastStoneWeight(stones));
    }
}
