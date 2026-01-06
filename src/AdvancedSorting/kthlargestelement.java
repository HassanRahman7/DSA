package AdvancedSorting;

public class kthlargestelement 
{
    public static void swap(int arr[],int i,int j) 
    {
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int partition(int arr[],int lo,int hi) 
    {
        int j,pivot=arr[lo],pidx=lo,smallercount=0,i,correctindex;
        for(i=lo+1;i<=hi;i++)
        {
            if(arr[i]<=pivot)
                smallercount++;
        }
        correctindex=pidx+smallercount;
        swap(arr,correctindex,pidx);
        i=lo;
        j=hi;
        while(i<correctindex&&j>correctindex)
        {
            if(arr[i]<=pivot)
                i++;
            else if(arr[j]>pivot)
                j--;
            else if(arr[i]>pivot&&arr[j]<=pivot)
                swap(arr, i, j);
        }
        return correctindex;
        
    }
    public static void quick_sort(int arr[],int lo,int hi,int k) 
    {
        if(lo>hi)
            return;
        if(lo==hi)
        {
            if(lo==k-1)
            {
                System.out.println(arr[lo]);
                System.exit(0);
            }
        }
        int idx;
        idx=partition(arr, lo, hi);
        if(idx==k-1)
        {
            System.out.println(arr[idx]);
            System.exit(0);
        }
        if(k-1<idx)
            quick_sort(arr, lo, idx-1,k);
        else
            quick_sort(arr, idx+1, hi,k);
        
    }
    public static void print(int arr[]) 
    {
        int i;
        for(i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
    public static void main(String[] args) 
    {
        int k=2;
        int arr[]={4,9,1,2,6,5,8};
        print(arr);
        System.out.println();
        quick_sort(arr,0,arr.length-1,arr.length-k+1);
        print(arr);
    }
    
}
