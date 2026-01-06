package Stacks;

public class LinkedListimplementation 
{
    public static class Node
    {
        int val;
        Node next;
        Node(int val)
        {
            this.val=val;
        }

    }
    public static class LLStack
    {
        Node head=null;
        int size=0;
        void push(int x)
        {
            Node temp=new Node(x);
            temp.next=head;
            head=temp;
            size++;
        }
        void displayrec(Node h)
        {
            if(h==null)
            return;
            displayrec(h.next);
            System.out.print(h.val+" ");
        }
        void display()
        {
            displayrec(head);
            System.out.println();
        }
        void displayrev()
        {
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
        }
        int size()
        {
            return size;
        }
        int pop()
        {
            if(head==null)
            {
                System.out.println("Stack is empty.");
                return -1;
            }
            else
            {
                int x=head.val;
                head=head.next;
                size--;
                return x;
            }
        }
        int peep()
        {
            if(head==null)
            {
                System.out.println("Stack is empty.");
                return -1;
            }
            else
            return head.val;
        }
        boolean isEmpty()
        {
            if(head==null)
            return true;
            else
            return false;
        }
    }
    public static void main(String[] args) 
    {
        LLStack st=new LLStack();
        st.push(3);
        st.display();
        st.push(231);
        st.display();
        st.push(332);
        st.display();
        System.out.println(st.size());
        st.pop();
        st.display();
        System.out.println(st.size());
        st.push(12);
        st.push(3);
        st.push(21);   
    }
}
