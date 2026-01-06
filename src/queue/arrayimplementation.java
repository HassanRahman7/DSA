package queue;

public class arrayimplementation 
{
    public static class queueA
    {
        int front=-1;
        int rear=-1;
        int q[]=new int[100];
        int size=0;
        public void add(int val)
        {
            if(rear==-1&&front==-1)
            {
                rear++;
                front++;
                q[rear]=val;
                size++;
            }
            else if(rear==front)
            {
                q[++rear]=val;
                size++;
            }
            else if(rear==q.length)
            {
                System.out.println("Queue is full.");
                return;
            } 
            else
            {
                q[++rear]=val;
                size++;
            }
        }
        public int remove()
        {
            if(front==-1)
            {
                System.out.println("Queue is empty");
                return -1;
            }
            else
            {
                size--;
                return q[front++];
            }
        }
        public int peek()
        {
            if(front==-1)
            {
                System.out.println("Queue is full.");
                return-1;
            }
            return q[front];
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
            if(size==0)
            {
                System.out.println("Queue is empty.");
                return;
            }
            int i;
            for(i=front;i<=rear;i++)
            System.out.print(q[i]+" ");
            System.out.println();
        }
    }
    public static void main(String[] args) 
    {
        queueA q=new queueA();
        q.display();
        q.add(23);
        q.add(23);
        q.add(43);
        q.add(34);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.peek());
        System.out.println(q.size);
    }    
}
