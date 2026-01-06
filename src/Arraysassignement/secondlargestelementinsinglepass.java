package Arraysassignement;

import java.util.Scanner;

public class secondlargestelementinsinglepass 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int temp,n,i,a=0,b=0;
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array:");
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        a=arr[0];
        b=arr[0];
        for(i=1;i<n;i++)
        {
            if(b<arr[i]&&a>arr[i])
            b=arr[i];
            else if(arr[i]>a&&arr[i]>b)
            {
                temp=a;
                a=b;
                b=temp;
                a=arr[i];
            }
        }
        System.out.println("Second largest ="+b);
        
    }
    
}
