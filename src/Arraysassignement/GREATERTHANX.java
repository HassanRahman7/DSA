package Arraysassignement;

import java.util.Scanner;

public class GREATERTHANX 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int c=0,i,n,x;
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        System.out.println("Enter the value of x");
        x=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array:");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]>x)
            c++;
        }
        System.out.println("Number of elements in the array which is greater than x is="+c);


        
    }
    
}
