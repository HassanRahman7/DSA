package Binarysearch;

public class counthillsandvalleysinanarray 
{
    public static void main(String[] args) 
    {
        int arr[]={6,6,5,5,4,1};
        int c=0,i,n,d;
        n=arr.length;
        for(i=1;i<n-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                d=i;
                while(d<n-1)
                {
                    if(arr[d]==arr[d+1])
                    d++;
                    else
                    break;
                }
                if(d<n-1&&arr[i]>arr[d+1]&&arr[i]>arr[i-1])
                c++;
                if(d<n-1&&arr[i]<arr[d+1]&&arr[i]<arr[i-1])
                c++;
            }
            if(arr[i]>arr[i+1]&&arr[i]>arr[i-1])
            c++;
            if(arr[i]<arr[i+1]&&arr[i]<arr[i-1])
            c++;
        }
        System.out.println(c);
    }
    
}
