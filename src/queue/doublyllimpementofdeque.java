package queue;
public class doublyllimpementofdeque 
{
    public static class Node
    {
        int val;
        Node next;
        Node prev;
        Node(int val)
        {
            this.val=val;
        }
    }
    public static class dq
    {
        Node head=null;
        Node tail=null;
        int size=0;
        public void addf(int x)
        {
            Node temp=new Node(x);
            if(head==null)
            {
                head=tail=temp;
                size++;
            }
            else
            {
                temp.next=head;
                head.prev=temp;
                head=temp;
                size++;
            }
        }
        public void addr(int x)
        {
            Node temp=new Node(x);
            if(head==null)
            {
                head=tail=temp;
                size++;
            }
            else
            {
                tail.next=temp;
                temp.prev=tail;
                tail=temp;
                size++;
            }
        }
        public int removef() throws Exception
        {
            if(head==null)
            {
                throw new Exception("Dequeue is empty.");
            }
            else
            {
                int v=head.val;
                head=head.next;
                size--;
                return v;
            }
        }
        public int remover() throws Exception
        {
            if(head==null)
            {
                throw new Exception("Dequeue is empty.");
            }
            else
            {
                int v=tail.val;
                tail=tail.prev;
                tail.next=null;
                size--;
                return  v;
            }
        }
        public boolean isEmpty()
        {
            if(size==0)
            return true;
            else
            return false;
        }
        public void display()
        {
            if(head==null)
            {
                System.out.println("deque is empty.");
                return;
            }
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        public int peekf() throws Exception
        {
            if(head==null)
            {
                throw new Exception("Deque is empty.");
            }
            else
            {
                return head.val;
            }
        }
        public int peekr() throws Exception
        {
            if(head==null)
            throw new Exception("Deque is full.");
            else
            return tail.val;
        }
    }
    public static void main(String[] args) throws Exception 
    {
        dq w=new dq();
        w.display();
        w.addf(23);
        w.addf(43);
        w.display();
        w.addr(43);
        w.addr(34);
        w.display();
        System.out.println("Element removed from front:"+w.removef());
        w.display();
        System.out.println("Element removed from rear:"+w.remover());
        w.display();
        System.out.println("Element at front:"+w.peekf());
        System.out.println("Element at rear:"+w.peekr());   
    }   
}