package Binarysearch;

import java.util.Scanner;

public class kthmissingpositivenummeth2 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int mis=0,lo=0,hi,mid=0,k,i,n;
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array:");
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        System.out.println("Enter the value of K:");
        k=sc.nextInt();
        hi=n-1;
        while(lo<=hi)
        {
            mid=lo+(hi-lo)/2;
            mis=arr[mid]-(mid+1);
            if(mis<k)
            lo=mid+1;
            else
            hi=mid-1;
        }
        System.out.println(k+hi+1);

    }
    
}
