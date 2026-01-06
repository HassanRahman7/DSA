package Sorting;

import java.util.Scanner;

public class Checkarraysortedornot 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int i,n;
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements in the array:");
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        for(i=0;i<n-1;i++)
        {
            if(arr[i]<=arr[i+1])
            continue;
            else
            {
                System.out.println("Not sorted.");
                System.exit(0);
            }
        }
        System.out.println("Sorted.");
        
    }
    
}
