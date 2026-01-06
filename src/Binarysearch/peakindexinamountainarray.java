package Binarysearch;

public class peakindexinamountainarray 
{
    public static void main(String[] args) 
    {
        int arr[]={10,20,30,40,50,60,70,20,10};
        int lo=0,hi=arr.length-1,mid=0;

        while(lo<=hi)
        {
            mid=(lo+hi)/2;
            if(arr[mid]<arr[mid+1])
            lo=mid+1;
            else if(arr[mid]<arr[mid-1])
            hi=mid-1;
            else
            break;
        }
        System.out.println(mid);
        
    }
    
}
