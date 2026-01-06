package Binarysearch;

import java.util.Scanner;

public class upperbound 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int x,i,n;
        boolean flag=false;
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array:");
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        System.out.println("Enter the value of x:");
        x=sc.nextInt();
        if(x<arr[0])
        System.err.println(0);
        else if(x>arr[n-1])
        System.out.println(n);
        else
        {
            int lo=0,hi=n-1,mid=0;
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
                    while(j<n)
                    {
                        if(arr[j]==x)
                            j++;
                        else 
                            break;
                    }
                    System.out.println(j);
                    flag=true;
                    break;
                }
            }
            if(flag==false)
            System.out.println(mid);
        }
        
    }
    
}
