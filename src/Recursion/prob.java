package Recursion;

import java.util.Scanner;

public class prob 
{
    public static void print(int arr[],int n) 
    {
        if(n==arr.length)
            return;
        else
        {
            System.out.println(arr[n++]);
            print(arr, n);
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n,i;
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array:");
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        System.out.println("Printing the elements:");
        print(arr, 0);
        
    }
    
}
