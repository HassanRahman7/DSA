package Sorting;

import java.util.Scanner;

public class Bubblesort 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int j,i,n,temp;
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        System.out.println("Enter the elements in the array:");
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        //optimized bubble sort.
        for(i=0;i<n-1;i++)
        {
            boolean flag=true;
            for(j=0;j<n-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=false;
                }
            }
            if(flag==true)
            break;
        }
        System.out.println("Displaying the array:");
        for(i=0;i<n;i++)
        System.out.print(arr[i]+" ");

        
    }
    
}
