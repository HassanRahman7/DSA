package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class reorderqueue 
{
    public static void main(String[] args) 
    {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        Stack<Integer> st=new Stack<>();
        int c=0;
        int k=q.size()/2;
        while(c!=k)
        {
            st.push(q.remove());
            c++;
        }
        while(st.size()!=0)
        {
            q.add(st.pop());
        }
        c=0;
        while(c!=k)
        {
            st.push(q.remove());
            c++;
        }
        while(st.size()!=0)
        {
            q.add(st.pop());
            q.add(q.remove());
        }
        while(q.size()!=0)
        {
            st.push(q.remove());
        }
        while(st.size()!=0)
        {
            q.add(st.pop());
        }
        System.out.println(q);


        
        
    }
    
}
