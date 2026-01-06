package AdvancedSorting;
public class quicksort 
{
    public static void swap(int arr[],int i,int j) 
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int partition(int arr[],int lo,int hi) 
    {
        int pivot=arr[lo],pidx=lo;
        int smallercount=0;
        int i;
        for(i=lo+1;i<=hi;i++)
        {
            if(arr[i]<=pivot)
                smallercount++;
        }        
        int correctindex=pidx+smallercount;
        //swap arr[pidx]and arr[correctindex]
        swap(arr, pidx, correctindex);
        //partition
        i=lo;
        int j=hi;
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
    public static void quick_sort(int arr[],int lo,int hi) 
    {
        if(lo>=hi)
            return;
        int idx=partition(arr,lo,hi);
        quick_sort(arr, lo, idx);
        quick_sort(arr, idx+1, hi);
    }
    public static void print(int arr[]) 
    {
        int i; 
        for(i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
    public static void main(String[] args) 
    {
        int arr[]={4,9,7,1,2,3,6,5,8};
        print(arr);
        System.out.println();
        quick_sort(arr,0,arr.length-1);
        print(arr);
    }    
}