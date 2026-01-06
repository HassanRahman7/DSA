package Linked_list;
class Node
{
    int val;
    Node next;
    Node(int val)
    {
        this.val=val;
    }
}
public class Listnodeclass 
{
    public static void print(Node head) 
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.val);
            temp=temp.next;
        }
    }
    public static void printrec(Node head) 
    {
        if(head==null)
        return;
        System.out.println(head.val);
        printrec(head.next);
    }
    public static void rev(Node head) 
    {
        if(head==null)
        return;
        rev(head.next);
        System.out.print(head.val+" ");
    }
    public static void main(String[] args) 
    {
        Node a=new Node(10);
        //System.out.println(a.next);
        Node b=new Node(20);
        //System.out.println(b);
        a.next=b;//Linking =>a to b
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);
        b.next=c;//Linking =>b to c
        c.next=d;//Linking =>c to d
        d.next=e;//Linking =>d to e
        /*System.out.println(a.val);
        System.out.println(a.next.val);
        System.out.println(a.next.next.val);
        System.out.println(a.next.next.next.val);
        System.out.println(a.next.next.next.val);*/  
        Node temp=a;
        printrec(a);
        rev(a);
        //Node temp=a;
        
    }
}
