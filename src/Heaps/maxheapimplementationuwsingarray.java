package Heaps;

class maxheap
{
    int arr[];
    int size;
    maxheap(int capacity)
    {
        arr=new int[capacity];
        size=0;
    }
    public void swap(int i,int j)
    {
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void upheapify(int i)
    {
        if(i==0)
            return;
        int p=(i-1)/2;
        if(arr[i]>arr[p])
        {
            swap(i,p);
            upheapify(p);
        }
    }
    public void add(int val) throws Exception
    {
        if(size==arr.length)
            throw new Exception("Max Heap is already full.");
        arr[size++]=val;
        upheapify(size-1);
    }
    public void downheapify(int i)
    {
        if(i>=size)
            return;
        int lc=2*i+1;
        int rc=2*i+2;
        int maxidx=i;
        if(lc<size && arr[lc]>arr[maxidx])
            maxidx=lc;
        if(rc<size && arr[rc]>arr[maxidx])
            maxidx=rc;
        if(i==maxidx)
            return;
        swap(i,maxidx);
        downheapify(maxidx);
    }
    public int remove() throws Exception
    {
        if(size==0)
            throw new Exception("No element is present at max heap.");
        int ele=arr[0];
        swap(0,size-1);
        size--;
        downheapify(0);
        return ele;
    }
    public int peek() throws Exception
    {
        if(size==0)
            throw new Exception("No element is present at max heap.");
        return arr[0];
    }
    public int size()
    {
        return size;
    }
}
public class maxheapimplementationuwsingarray
{
    public static void main(String[] args) throws Exception
    {
        maxheap pq=new maxheap(10);
        pq.add(43);
        pq.add(34);
        pq.add(34);
        pq.add(32);
        pq.add(45);
        System.out.println(pq.peek());
        System.out.println(pq.size());
        System.out.println(pq.remove());
        System.out.println(pq.size());
        System.out.println(pq.remove());
        System.out.println(pq.peek());
    }
}
