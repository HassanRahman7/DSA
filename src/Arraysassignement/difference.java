package Arraysassignement;

import java.util.Scanner;

public class difference 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int se=0,so=0,i,n;
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array:");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(i%2==0)
            so=so+arr[i];
            else
            se=se+arr[i];
        }
        System.out.println("Difference="+(se-so));
    }




        
    }
    

