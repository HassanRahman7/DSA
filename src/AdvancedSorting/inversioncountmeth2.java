package AdvancedSorting;

public class inversioncountmeth2 
{
    static int ans=0;
    public static void merge(int a[],int b[],int c[]) 
    {
        int i=0,j=0,k=0;
        while (i<a.length&&j<b.length) 
        {
            if(a[i]<b[j])
                c[k++]=a[i++];
            else if(a[i]>b[j])
                {
                    c[k++]=b[j++];
                    ans=ans+a.length-i;
                }
            else
                c[k++]=a[i++];
            
        }
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
        /*j=0;
        for(i=0;i<n/2;i++)
        {
            if(a[i]>b[j++])
            ans=ans+a.length-i;
        }*/
        merge_sort(a);
        merge_sort(b);
        merge(a,b,arr);
        a=null;
        b=null;
    }    
    public static void main(String[] args) 
    {
        int arr[]={109,33,89,27,60,10,70};
        merge_sort(arr);
        System.out.println(ans);
    
    }
}
