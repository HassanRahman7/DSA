package queue;

public class circularqueuearray 
{
    public static class cqa
    {
        int front =-1;
        int rear=-1;
        int size=0;
        int arr[]=new int[5];
        public void add(int val) throws Exception
        {
            if(size==arr.length)
            {
                throw new Exception("Queue is full");
            }
            else if(size==0)
            {
                rear=0;
                front=0;
                arr[rear]=val;
                size++;
                return;
            }
            else if(rear<arr.length-1)
            {
                arr[++rear]=val;
                size++;
                return;
            }
            else if(rear==arr.length-1)
            {
                rear=0;
                arr[rear]=val;
                size++;
                return;
            }
        }
        public int remove() throws Exception
        {
            if(size==0)
            {
                throw new Exception("Queue is empty.");
            }
            else if(front==arr.length-1)
            {
                int val=arr[front];
                front=0;
                size--;
                return val;
            }
            else
            {
                size--;
                return arr[front++];
            }
            
        }
        public int peek() throws Exception
        {
            if(size==0)
            {
                throw new Exception("Queue is empty.");
            }
            else
            return arr[front];
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
            if(isEmpty()==true)
            {
                System.out.println("Queue is empty.");
                return;
            }
            else
            {
                int i;
                if(rear<front)
                {
                    for(i=front;i<arr.length;i++)
                    System.out.print(arr[i]+" ");
                    for(i=0;i<=rear;i++)
                    System.out.print(arr[i]+" ");
                }
                else if(front<=rear)
                {
                    for(i=front;i<=rear;i++)
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) throws Exception 
    {
        cqa q=new cqa();
        q.display();
        q.add(23);
        q.add(3);
        q.add(3);
        q.add(34);
        q.display();
        q.remove();
        q.display();
        q.add(43);
        q.display();
        q.add(23);
        q.display();
    }
}
