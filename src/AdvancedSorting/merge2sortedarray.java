package AdvancedSorting;

public class merge2sortedarray 
{
    public static void merge(int a[],int b[],int c[]) 
    {
        int i=0,j=0,k=0;
        while(i<a.length&&j<b.length)
        {
            if(a[i]<b[j])
            {
                c[k++]=a[i++];
            }   
            else if(a[i]>b[j])
            {
                c[k++]=b[j++];
            }
            else
                c[k++]=a[i++];
        }
        System.out.println(j);
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
    public static void print(int arr[]) 
    {
        int i;
        for(i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
    }
    public static void main(String[] args) 
    {
        int a[]={10,30,50,60,80,90};
        int b[]={21,42,72,78};
        int c[]=new int[a.length+b.length];
        //print(a);
        //print(b);
        merge(a, b, c);
        print(c);
        
    }
    
}
