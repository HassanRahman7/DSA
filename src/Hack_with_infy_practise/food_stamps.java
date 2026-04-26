package Hack_with_infy_practise;
import java.util.PriorityQueue;
public class food_stamps 
{
    public static long Solve(int N,long M,long v[],long d[])
    {
        PriorityQueue<long[]> maxHeap=new PriorityQueue<>((a,b)-> Long.compare(b[0],a[0]));
        int i=0;
        while(i<N)
        {
            if(v[i]>0)
                maxHeap.offer(new long[]{v[i],d[i]});
            i++;
        }   
        long total_score=0,mealsPicked=0;
        while(mealsPicked<M && maxHeap.isEmpty()==false)
        {
            long bestFood[]=maxHeap.poll();
            long curr_val=bestFood[0];
            long diff=bestFood[1];
            if(curr_val<=0)
                break;
            total_score=total_score+curr_val;
            mealsPicked++;     
            long next_val=curr_val-diff;  
            if(next_val>0)
                maxHeap.offer(new long[]{next_val,diff});
        }
        return total_score;
    }
    public static void main(String[] args) 
    {
        int n=3;
        long m=5;
        long v[]={5,7,9};
        long d[]={2,4,6};
        System.out.println(Solve(n,m,v,d));
    }
}
