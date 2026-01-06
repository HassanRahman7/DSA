package Binarysearch;

import java.util.Scanner;

public class lowerboundmeth2 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int x,n,i,lb;
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        int arr[]=new int[n];
        lb=n;
        System.out.println("Enter the elements in the array:");
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        System.out.println("Enter the value of x");
        x=sc.nextInt();
        if(x<arr[0])
        System.out.println(0);
        else if(x>arr[n-1])
        System.out.println(n);
        else
        {
            int hi,lo,mid=0;
            lo=0;
            hi=n-1;
            while(lo<=hi)
            {
                mid=(lo+hi)/2;
                if(arr[mid]<x)
                lo=mid+1;
                else if(arr[mid]>=x)
                {
                    hi=mid-1;
                    lb=Math.min(lb,mid);
                }
            }
            System.out.println(lb);   
        }
    }
}
