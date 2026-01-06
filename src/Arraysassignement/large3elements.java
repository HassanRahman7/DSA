package Arraysassignement;

import java.util.Scanner;

public class large3elements 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int l1,l2,l3,i,n;
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array:");
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        l1=arr[0];
        for(i=1;i<n;i++)
        {
            if(arr[i]>l1)
            l1=arr[i];
        }
        l2=arr[0];
        for(i=1;i<n;i++)
        {
            if(arr[i]>l2&&arr[i]!=l1)
            l2=arr[i];
        }
        l3=arr[0];
        for(i=1;i<n;i++)
        {
            if(arr[i]>l3&&arr[i]!=l1&&arr[i]!=l2)
            l3=arr[i];
        }
        System.out.println("The three largest elements in the array are "+l1+" "+l2+" "+l3);


        
    }
    
}
