package Arraysassignement;

import java.util.Scanner;

public class checksort 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int i,n,c=0,j;
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array:");
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    c++;
                    System.out.println("Array is not sorted.");
                    break;
                }
            }
            if(c!=0)
            break;
        
        }
        if(c==0)
        System.out.println("Array is sorted.");

        
    }
    
}
