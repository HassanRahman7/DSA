package Binarysearch;

import java.util.Scanner;

public class leetcode1011 
{
    public static boolean isPossible(int c,int arr[],int d)
    {
        int n=arr.length;
        int load=0;
        int days=1;
        int i;
        for(i=0;i<n;i++)
        {
            if(load+arr[i]<=c)
            load=load+arr[i];
            else
            {
                load=arr[i];
                days++;
            }
        }
        if(days>d)
        return false;
        return true;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int d,n,i,lo,hi,minc=0,mx,mid,s=0;
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        System.out.println("Enter the elements in the array:");
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        System.out.println("Enter the number of days:");
        d=sc.nextInt();
        mx=Integer.MIN_VALUE;
        for(i=0;i<n;i++)
        {
            if(arr[i]>mx)
            mx=arr[i];
            s=s+arr[i];
        }
        lo=mx;
        hi=s;
        minc=s;
        while(lo<=hi)
        {
            mid=lo+(hi-lo)/2;
            if(isPossible(mid,arr,d)==true)
            {
                minc=mid;
                hi=mid-1;
            }
            else
            lo=mid+1;
        }
        System.out.println(minc);
    }
    
}
