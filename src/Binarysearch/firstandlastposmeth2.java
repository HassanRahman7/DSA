package Binarysearch;

import java.util.Scanner;

public class firstandlastposmeth2 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        boolean flag=false;
        int arr[]={10,10,20,20,20,20,20,30,30,30,40,40};
        int x=20;
        int lo=0,hi=arr.length-1,mid=0,fp=-1,lp=-1;
        while(lo<=hi)
        {
            mid=(lo+hi)/2;
            if(arr[mid]<x)
            lo=mid+1;
            else if(arr[mid]>x)
            hi=mid-1;
            else if(arr[mid]==x) 
            {
                if(mid>0&&arr[mid]==arr[mid-1])
                hi=mid-1;
                else
                {
                    fp=mid;
                    break;
                }
            }
        }
        lo=0;
        hi=arr.length-1;
        mid=0;
        while(lo<=hi)
        {
            mid=(lo+hi)/2;
            if(arr[mid]<x)
            lo=mid+1;
            else if(arr[mid]>x)
            hi=mid-1;
            else
            {
                if(mid<arr.length-1&&arr[mid]==arr[mid+1])
                lo=mid+1;
                else
                {
                    lp=mid;
                    break;
                }
            }
        }
        System.out.println(fp);
       System.out.println(lp);  
       
    }
}


