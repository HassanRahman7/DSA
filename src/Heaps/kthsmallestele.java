package Heaps;
import java.util.Collections;
import java.util.PriorityQueue;
public class kthsmallestele 
{
    static int solve(int arr[], int k)
    {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        int i=0;
        while(i!=arr.length)
        {
            pq.add(arr[i++]);
            if(pq.size()>k)
                pq.remove();
        }
        return pq.peek();
    }
    public static void main(String[] args) 
    {
        int arr[] = {7, 10, 4, 3, 20, 15};
        int k=3;
        System.out.println("Answer:"+solve(arr,k));
    }
}