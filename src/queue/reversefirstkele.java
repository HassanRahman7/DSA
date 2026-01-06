package queue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
//Reverse first k elements of a queue.
public class reversefirstkele 
{
    public static void main(String[] args) 
    {
        Queue<Integer> q=new LinkedList<>();
        Stack<Integer> st=new Stack<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        int k=3;
        int i=1;
        while(i!=k+1)
        {
            st.push(q.poll());
            i++;
        }
        Queue<Integer> q2=new LinkedList<>();
        while(q.isEmpty()==false)
            q2.add(q.poll());
        while(st.size()!=0)
            q.add(st.pop());
        while(q2.size()!=0)
            q.add(q2.poll());
        System.out.println(q);
    }
}