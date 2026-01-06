package AdvancedSorting;
public class mergsort 
{
    public static void merge(int a[],int b[],int c[]) 
    {
        int i=0,j=0,k=0;
        while(i<a.length&&j<b.length)
        {
            if(a[i]<b[j])
                c[k++]=a[i++];
            else if(a[i]>b[j])
                c[k++]=b[j++];
            else
                c[k++]=a[i++];
        }
//        System.out.println(j);
        if(j>=b.length)
        {
            while(i<a.length)
                c[k++]=a[i++];
        }
        else if(i>=a.length)
        {
            while(j<b.length)
                c[k++]=b[j++];
        }
    }
    public static void merge_sort(int arr[]) 
    {
        int n=arr.length;
        if(n==1)
            return;
        int a[]=new int[n/2];
        int b[]=new int[n-n/2];
        int i,j;
        for(i=0;i<n/2;i++)
            a[i]=arr[i];
        for(j=0;j<n-n/2;j++)
            b[j]=arr[i++];
        /*print(a);
        System.out.println();
        print(b);*/
        //magic
        merge_sort(a);
        merge_sort(b);
        merge(a, b, arr);
        a=null;
        b=null;//THIS IS DONE TO IMPROVE THE SPACE COMPLEXITY.
    }
    public static void print(int arr[]) 
    {
        int i;
        for(i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
    public static void main(String[] args) 
    {
        int arr[]={80,30,50,20,60,10,70,40};
        print(arr);
        System.out.println();
        merge_sort(arr);
        print(arr);
    }     
}