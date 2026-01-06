package Linked_list;

class dnode
{
    int val;
    dnode next;
    dnode prev;
    dnode(int val)
    {
        this.val=val;
    }

}
class DLL
{
    dnode head;
    dnode tail;
    int size;
    void display()
    {
        dnode temp=head;
        while(temp!=null)
        {
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    void insertAtHead(int val)
    {
        dnode temp=new dnode(val);
        if(size==0)
        head=tail=temp;
        else
        {
            head.prev=temp;
            temp.next=head;
            head=temp;
            head.prev=null;
        }
        size++;
    }
    void insertAtTail(int val)
    {
        dnode temp=new dnode(val);
        if(size==0)
            head=tail=temp;
        else
        {
            tail.next=temp;
            temp.prev=tail;
            tail=temp;
        }
        size++;
    }
    void insert(int idx,int val)
    {
        if(idx==0)
        {
            insertAtHead(val);
            return;
        }
        if(idx==size)
        {
            insertAtTail(val);
            return; 
        }
        if(idx>size||idx<0)
        {
            System.out.println("Invalid index.");
            return;
        }
        dnode temp=new dnode(val);
        dnode x=head;
        int i=0;
        while(i!=idx-1)
        {
            x=x.next;
            i++;
        }
        dnode y=x.next;
        x.next=temp;
        temp.next=y;
        temp.prev=x;
        y.prev=temp;
        size++;
        
    }
    void deleteathead()
    {
        if(head==null)
        {
            System.out.println("List is empty.");
            return;
        }
        else
        {
            head=head.next;
            head.prev=null;
            size--;
        }
    }
    void deleteattail()
    {
        if(head==null)
        {
            System.out.println("List is empty.");
            return;
        }
        else
        {
            tail=tail.prev;
            tail.next=null;
            size--;
        }
    }
    void delete(int idx)
    {
        if(idx==0)
        {
            deleteathead();
            return;
        }
        if(idx<0||idx>=size)
        {
            System.out.println("Invalid index");
            return;
        }
        if(idx==size-1)
        {
            deleteattail();
            size--;
            return;
        }
        int i=0;
        dnode temp=head;
        while(i!=idx-1)
        {
            temp=temp.next;
            i++;
        }
        temp.next=temp.next.next;
        dnode y=temp.next;
        y.prev=temp;
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
        dnode temp=head;
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
        dnode temp=head;
        int i=0;
        while(i!=idx)
        {
            temp=temp.next;
            i++;
        }
        temp.val=val;
    }
}
public class doublylinkedlistimplementation 
{
    public static boolean pal(dnode head,dnode tail)
    {
        dnode temp=head;
        dnode temp2=tail;
        while(temp!=null&&temp2!=null)
        {
            if(temp.val==temp2.val)
            {
                temp=temp.next;
                temp2=temp2.prev;
            }
            else
            return false;
        }
        return true;
    }
    public static void print(dnode head) 
    {
        dnode temp=head;
        while(temp!=null)
        {
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
        
    }
    public static void revprint(dnode tail) 
    {
        dnode temp=tail;
        while(temp!=null)
        {
            System.out.print(temp.val+" ");
            temp=temp.prev;
        }
        System.out.println();

        
    }
    public static void display(dnode node) 
    {
        dnode temp=node;
        while(temp.prev!=null)
            temp=temp.prev;
        //now temp at head
        print(temp);
        
    }
    public static void main(String[] args) 
    {
        dnode a=new dnode(10);
        dnode b=new dnode(20);
        dnode c=new dnode(20);
        dnode d=new dnode(10);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=null;
        b.prev=a;
        c.prev=b;
        d.prev=c;
        print(a);
        revprint(d);
        display(c);
        System.out.println(pal(a,d));
        DLL list=new DLL();
        list.display();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.display();
        list.insertAtTail(40);
        list.display();
        list.insertAtHead(50);
        list.display();
        list.insert(2, 032);
        list.display();
        list.insertAtTail(123);
        list.display();
        list.deleteathead();
        list.display();
        list.deleteattail();
        list.display();
        list.delete(3);
        list.display();
        System.out.println(list.getElement(3));
        list.set(3, 3);
        list.display();
    }
    
}
