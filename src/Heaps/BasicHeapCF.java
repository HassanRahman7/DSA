package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class BasicHeapCF 
{
    public static void main(String[] args) 
    {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        pq.add(2);
        System.out.println(pq+" "+pq.peek());
        pq.add(10);
        System.out.println(pq+" "+pq.peek());
        pq.add(1);
        System.out.println(pq+" "+pq.peek());
        pq.remove();
        pq.add(0);
        System.out.println();
        System.out.println(pq.peek());
    }
    
}
