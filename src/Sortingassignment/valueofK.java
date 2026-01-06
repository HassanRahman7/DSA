package Sortingassignment;

import java.util.Scanner;

public class valueofK 
{
    public static boolean isSorted(int arr[]) 
    {
        int i;
        for(i=0;i<arr.length-1;i++)
        {
            if(arr[i]<=arr[i+1])
            continue;
            else
            return false;
        }
        return true;
    }
    public static int maximum(int arr[]) 
    {
        int max=arr[0],i;
        for(i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            max=arr[i];
        }
        return max;
    }
    public static int minimum(int arr[]) 
    {
        int min=arr[0],i;
        for(i=1;i<arr.length;i++)
        {
            if(arr[i]<min)
            min=arr[i];
        }
        return min;
    }
    public static int absolute(int m) 
    {
        if(m>0)
        return m;
        else
        return -1*m;    
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int j,i,n,max,min,c=0;
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        int arr[]=new int[n];
        int brr[]=new int[n];
        System.out.println("Enter the elements in the array:");
        for(i=0;i<n;i++)
            arr[i]=sc.nextInt();
        if(isSorted(arr)==true)
        System.out.println(0);
        else
        {
            max=maximum(arr);
            min=minimum(arr);
            for(j=min;j<=max;j++)
            {
                for(i=0;i<n;i++)
                    brr[c++]=absolute(arr[i]-j);
                if(isSorted(brr)==true)
                {
                    System.out.println(j);
                    System.exit(0);
                }
                else
                    c=0;
            }
            System.out.println(-1);
        }
        
        
    }
    
}
