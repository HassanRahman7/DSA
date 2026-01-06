package queue;

import java.util.LinkedList;
import java.util.Deque;
public class deque 
{
    public static void main(String[] args) 
    {
        Deque<Integer> dq=new LinkedList<>();
        //add,remove/poll,peek/element
     /*    dq.addLast(1);
        dq.addLast(2);
        dq.addLast(3);
        dq.addLast(4);
        System.out.println(dq);
        dq.addFirst(5);
        System.out.println(dq);
        dq.removeLast();
        System.out.println(dq);
        dq.removeFirst();
        System.out.println(dq);
        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());
*/
        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(1);
        dq.addLast(4);
        dq.add(5);//last mai add karta hai.
        System.out.println(dq);
        dq.remove();//first remove.
       // dq.removeAll(dq);//removes everything.
        System.out.println(dq);
        dq.add(1);
        dq.removeFirstOccurrence(1);
        System.out.println(dq);
        dq.removeLastOccurrence(1);
        System.out.println(dq);
    }
    
}
