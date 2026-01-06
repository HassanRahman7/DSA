package Linked_list;
//Very Important
class SLL
{//User defined data structure
     Node head;
     Node tail;
     int size;
    void insertAtEnd(int val)
    {
        Node temp=new Node(val);
        if(head==null)
            head=tail=temp;
        else
        {
            tail.next=temp;
            tail=temp;
        }
        size++;
    }
    void display() 
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    void size()
    {
        System.out.println("Length of linked list is:"+size);
    }
    void insert(int idx,int val)
    {
        if(idx==0)
        {
            insertAtBeginning(val);
            return;
        }    
        else if(idx==size)
        {
            insertAtEnd(val);
            return;
        }
        if(idx>size)
        {
            System.out.println("Invalid Index");
            return;
        }
        Node temp=new Node(val);
        Node x=head;
        int i=0;
        while(i!=idx-1)
        {
            x=x.next;
            i++;
        }
        temp.next=x.next;
        x.next=temp;
    }
    void deleteathead()
    {
        if(head==null)
        {
            System.out.println("List is empty.");
            return;
        }
        head=head.next;
        size--;
    }
    void deleteatIndex(int idx)
    {
        if(idx==0)
        {
            deleteathead();
            return;
        }
        if(idx<0||idx>=size)
        {
            System.out.println("Invalid Index.");
            return;
        }
        Node temp=head;
        int i=0;
        while(i!=idx-1)
        {
            temp=temp.next;
            i++;
        }
        if(temp.next==tail)
            tail=temp;
        temp.next=temp.next.next;
        tail=temp;
        size--;
    }
    int getElement(int idx)
    {
        if(idx<0||idx>=size)
        {
            System.out.println("Invalid index");
            return -1;
        }
        if(idx==0)
            return head.val;
        if(idx==size-1)
            return tail.val;
        Node temp=head;
        int i=0;
        while(i!=idx)
        {
            temp=temp.next;
            i++;
        }
        return temp.val;
    }
    void set(int idx,int val)
    {
        if(idx==0)
        {
            head.val=val;
            return;
        }
        if(idx==size-1)
        {
            tail.val=val;
            return;
        }
        if(idx<0||idx>=size)
        {
            System.out.println("Invalid index.");
            return;
        }
        Node temp=head;
        int i=0;
        while(i!=idx)
        {
            temp=temp.next;
            i++;
        }
        temp.val=val;
    }
    void insertAtBeginning(int val)
    {
        Node temp=new Node(val);
        if(temp==null)
            head=tail=temp;
        else
        {
            temp.next=head;
            head=temp;
        }
    }
}
public class implementationLL 
{
    public static void main(String[] args) 
    {
        SLL list=new SLL();
        //System.out.println(list.size);
        list.insertAtEnd(10);
        list.insertAtEnd(10);
        //System.out.println(list.size);
        list.insertAtEnd(10);
        list.insertAtEnd(10);
        list.display();
        list.insertAtEnd(23);
        list.display();
        list.size();
        list.insertAtEnd(10);
        list.insertAtEnd(10);
        list.insertAtEnd(10);
        list.insertAtEnd(10);
        list.display();
        list.insertAtBeginning(23);
        list.display();
        list.insertAtBeginning(324);
        list.display();
        list.insert(3,654 );
        list.display();
        System.out.println(list.getElement(12));
        list.set(3,2);
        list.display();
        list.deleteathead();
        list.display();
        list.deleteatIndex(2);
        list.display();
    }
}
