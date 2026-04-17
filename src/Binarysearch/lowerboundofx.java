package Binarysearch;

import java.util.Scanner;

public class lowerboundofx 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int x,n,i;
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array:");
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        //int arr[]={10,20,30,30,40,50,60,70};
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
                else if(arr[mid]>x)
                hi=mid-1;
                else if(arr[mid]==x)
                {
                    int j;
                    j=mid;
                    while(j>=0)
                    {
                        if(arr[j]==x)
                            j--;
                        else 
                            break;
                    }
                    System.out.println(j+1);
                    System.exit(0);
                }
            }
            System.out.println(mid);
        }
    }
}
