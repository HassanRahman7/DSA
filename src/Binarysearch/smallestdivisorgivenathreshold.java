package Binarysearch;

import java.util.Scanner;



public class smallestdivisorgivenathreshold 
{
    public static int max(int arr[]) 
    {
        int mx=Integer.MIN_VALUE;
        int i;
        for(i=0;i<arr.length;i++)
        {
            if(mx<arr[i])
            mx=arr[i];
        }
        return mx;
    }
    public static int sum(int arr[],int d) 
    {
        int s=0;
        int i;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]%d==0)
            s=s+arr[i]/d;
            else
            s=s+arr[i]/d+1;
        }
        return s;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int c=0,mid=1,hi,i,n,t,lo=1,s;
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements in the array:");
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        System.out.println("Enter the threshold:");
        t=sc.nextInt();
        hi=max(arr);
        while(lo<=hi)
        {
            mid=lo+(hi-lo)/2;
            s=sum(arr, mid);
            if(s<=t)
            {
                c=mid;
                hi=mid-1;
            }
            else if(s>t)
            lo=mid+1;
                        

        }
        System.out.println(c);




        
    }
    
}
