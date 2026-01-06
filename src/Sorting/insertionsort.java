package Sorting;

import java.util.Scanner;

public class insertionsort 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,temp;
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array:");
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        for(i=1;i<n;i++)
        {
            for(j=i;j>=1;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else
                break;
            }
        }
        System.out.println("Printing the modified array:");
        for(i=0;i<n;i++)
        System.out.print(arr[i]+" ");

    }
    
}
