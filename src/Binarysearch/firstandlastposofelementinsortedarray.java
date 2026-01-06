package Binarysearch;

import java.util.Scanner;

public class firstandlastposofelementinsortedarray 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        boolean flag=false;
        int arr[]={10,10,20,20,20,20,20,30,30,30,40,40};
        int x=20;
        int lo=0,hi=arr.length-1,mid=0,fp,lp;
        //First check whether element is present or not>
        while(lo<=hi)
        {
            mid=(lo+hi)/2;
            if(arr[mid]<x)
            lo=mid+1;
            else if(arr[mid]>x)
            hi=mid-1;
            else
            {
                flag=true;
                break;
            }
        }
        if(flag==false)
        {
            System.out.println(-1);
            System.out.println(-1);
            System.exit(0);
        }
        else
        {
            fp=arr.length;
            while(lo<=hi)
            {
                mid=(lo+hi)/2;
                if(arr[mid]>=x)
                {
                    fp=Math.min(mid,fp);
                    hi=mid-1;
                }
                else
                lo=mid+1;
            }
            lo=0;
            hi=arr.length-1;
            mid=0;
            lp=arr.length;
            while(lo<=hi)
            {
                mid=(lo+hi)/2;
                if(arr[mid]<x)
                lo=mid+1;
                else if(arr[mid]>x)
                {
                    hi=mid-1;
                    lp=Math.min(mid, lp);
                }
                else
                lo=mid+1;
            }
            System.out.println(fp);
            System.out.println(lp-1);
        }
    }
    
}
