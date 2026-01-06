package queue;

public class linkedlistimplementation 
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
    public static class queueLL
    {
        Node head=null;
        Node tail=null;
        
        int size=0;
        public void add(int x)
        {
            Node temp=new Node(x);
            if(size==0)
                head=tail=temp;
            else
            {
                tail.next=temp;
                tail=temp;
            }
            size++;
        }
        public int peek()
        {
            if(head==null)
            {
                System.out.println("Queue is empty.");
                return -1;
            }
            else
                return head.val;
        }
        public int remove()
        {
            if(head==null)
            {
                System.out.println("Queue is empty.");
                return -1;
            }
            else
            {
                int v=head.val;
                head=head.next;
                size--;
                return v;
            }
        }
        public void display()
        {
            if(size==0)
            System.out.println("Queue is empty.");
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        public boolean isEmpty()
        {
            if(size==0)
            return true;
            else
            return false;
        }
    }
    public static void main(String[] args) 
    {
        queueLL q=new queueLL();
        q.display();
        System.out.println(q.isEmpty());
        q.add(23);
        q.add(3);
        q.add(34);
        q.add(23);
        q.display();
        System.out.println(q.peek());
        q.remove();
        q.display();
        System.out.println(q.size);
    }
}