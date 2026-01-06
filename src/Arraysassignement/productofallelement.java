package Arraysassignement;

import java.util.Scanner;


public class productofallelement 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int prod=1,i,n;
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array:");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            prod=prod*arr[i];
        }
        System.out.println("The product of all the elements present in the array is="+prod);


        
    }
    
}
