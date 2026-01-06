package Heaps;

class MinHeap
{
    private int arr[];
    private int size;
    MinHeap(int capacity)
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
        if(arr[i]<arr[p])
        {
            swap(i,p);
            upheapify(p);
        }
    }
    public void DownHeapify(int i)
    {
        if(i>=size)
            return;
        int lc=2*i+1;
        int rc=2*i+2;
        int minidx=i;
        if(lc<size && arr[minidx]>arr[lc])
            minidx=lc;
        if(rc<size && arr[minidx]>arr[rc])
            minidx=rc;
        if(i==minidx)
            return;
        swap(i,minidx);
        DownHeapify(minidx);
    }
    public int remove() throws Exception
    {
        if(size==0)
            throw new Exception("Min Heap is empty.");
        // First we will swap arr[0] with arr[size-1]
        int peek=arr[0];
        swap(0,size-1);
        // now we will decrease the size;
        size--;
        // now we will downheapify
        DownHeapify(0);
        return peek;
    }
    public void add(int val) throws Exception
    {
        if(size==arr.length)
            throw new Exception("Min Heap is full.");
        arr[size++]=val;
        // Now we will upheapify it.
        upheapify(size-1);
    }
    public int size()
    {
        return size;
    }
    public int peek() throws Exception
    {
        if(size==0)
            throw new Exception("No elements available at the min heap. First insert an element.");
        return arr[0];
    }
}
public class MinHeapImplementationArray
{
    public static void main(String[] args) throws Exception
    {
        MinHeap pq=new MinHeap(10);
//      System.out.println(pq.peek());
        System.out.println(pq.remove());
        System.out.println(pq.size());
        pq.add(2);
        pq.add(3);
        pq.add(4);
        System.out.println(pq.size());
        System.out.println(pq.peek());
        pq.add(9);
        System.out.println(pq.peek());
        pq.add(4);
        System.out.println(pq.peek());
        System.out.println(pq.size());
        System.out.println(pq.remove());
    }
}