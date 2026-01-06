package queue;

public class CIrcularqueueLL 
{
    public static class Node
    {
        int val;
        Node next;
        Node (int val)
        {
            this.val=val;
        }
    }
    public static class Cqll
    {
        Node head=null;
        Node tail=null;
        int size=0;
        public void add(int x)
        {
            Node temp=new Node(x);
            if(size==0)
            {
                head=tail=temp;
                head.val=x;
                tail.next=head;
                size++;
            }
            else
            {
                tail.next=temp;
                tail=temp;
                tail.next=head;
                size++;
            }
        }
        public int remove() throws Exception
        {
            if(size==0)
            throw new Exception("Circular queue is empty.");
            else
            {
                int v;
                v=head.val;
                head=head.next;
                tail.next=head;
                size--;
                return v;
            }
        }
        public int peek() throws Exception
        {
            if(size==0)
            throw new Exception("Circular queue is empty.");
            else
            return head.val;
        }
        public void display()
        {
            if(head==null)
            System.out.println("Queue is empty.");
            else
            {
                Node temp=head;
                while(temp!=tail)
                {
                    System.out.print(temp.val+" ");
                    temp=temp.next;
                }
                System.out.print(temp.val);
                System.out.println();
            }
        }
        public boolean isEmpty()
        {
            if(size==0)
            return true;
            else
            return false;
        }
    }
    public static void main(String[] args) throws Exception 
    {
        Cqll q=new Cqll();
        q.display();
        q.add(234);
        q.add(234);
        q.add(34);
        q.remove();
        q.display();
    }
}