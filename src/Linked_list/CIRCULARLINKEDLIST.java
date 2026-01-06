package Linked_list;

//import java.nio.file.NotDirectoryException;

class CLL
{
    Node head;
    void display()
    {
        Node temp=head;
        while(true)
        {
            System.out.println(temp.val);
            if(temp.next==head)
            break;
            else
            temp=temp.next;
        }
    }
}

public class CIRCULARLINKEDLIST 
{
    public static void display(Node head) 
    {
        Node temp=head;
        while(true)
        {
            System.out.print(temp.val+" ");
            if(temp.next==head)
            break;
            else
            temp=temp.next;
        }
        System.out.println();
    }
    public static void insertAtTail(Node head,int val) 
    {
        Node temp=head;
        while(true)
        {
            if(temp.next==head)
            break;
            else
            temp=temp.next;
        }
        Node in=new Node(val);
        in.next=head;
        head=in;
        temp.next=head;
    }
    public static void insertAtHead(Node head,int val) 
    {
        if(head==null)
        {
            Node in=new Node(val);
            in.next=head;
        }
        else
        {
            Node in=new Node(val);
            in.next=head;
            Node temp=head;
            while(temp.next!=head)
            {
                temp=temp.next;
            }
            temp.next=in;
            head=in;
        }
    }
        
    
    public static void main(String[] args) 
    {
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        a.next=b;
        b.next=c;
        c.next=a;
        display(a);
        insertAtTail(a, 32);
        display(a);
    }
}