package Arraysassignement;

import java.util.Scanner;

public class minvalue 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int min,i,n;
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        System.out.println("Enter the elements in the array:");
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        min=arr[0];
        for(i=1;i<n;i++)
        {
            if(arr[i]<min)
            min=arr[i];
        }
        System.out.println("Min value ="+min);

        
    }
    
}
