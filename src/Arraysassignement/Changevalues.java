package Arraysassignement;

import java.util.Scanner;

public class Changevalues 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int i,n;
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array:");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(i%2!=0)
            arr[i]=arr[i]*2;
            else
            arr[i]=arr[i]+10;
        }
        System.out.println("Updated array:");
        for(i=0;i<n;i++)
        System.out.print(arr[i]+" ");
        
    }
    
}
