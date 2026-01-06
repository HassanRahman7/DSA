package Binarysearch;

public class searchinrotatedsortarr 
{
    public static void main(String[] args) 
    {
        int arr[]={3,4,5,6,7,0,1,2};
        int n;
        boolean flag=false;
        n=arr.length;
        int lo=0,hi=n-1;
        int target=5;
        while(lo<=hi)
        {
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==target)
            {
                System.out.println(mid);
                flag=true;
                break;
            }
            else if(arr[mid]<=arr[hi])//in right sorted array.
            {
                if(target>arr[mid]&&target<=arr[hi])
                lo=mid+1;
                else 
                hi=mid-1;
            }
            else
            {//in left sorted array.
                if(target>=arr[lo]&&target<arr[mid])
                hi=mid-1;
                else 
                lo=mid+1;
            }
        }
        if(flag==false)
        System.out.println(-1);
    }
}