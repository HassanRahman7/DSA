package Binarysearch;

import java.util.Arrays;
import java.util.Scanner;

public class bs 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int hi,i,n,lo,mid,target;
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        System.out.println("Enter the elements in the array:");
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        Arrays.sort(arr);
        System.out.println("Enter the target value:");
        target=sc.nextInt();
        lo=0;
        hi=n-1;
        boolean flag=false;
        while(lo<=hi)
        {
            mid=(lo+hi)/2;
            if(arr[mid]<target)
            lo=mid+1;
            else if(arr[mid]>target)
            hi=mid-1;
            else if(arr[mid]==target)
            {
                System.out.println("Target found at pos:"+(mid+1));
                flag=true;
                break;
            }
        }
        if(flag==false)
        System.out.println("Target not found.");

        
    }
    
}
