package Sorting;

import java.util.Scanner;

public class selectionsort 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int temp,mindx=-1,j,i,n;
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array:");
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        for(i=0;i<n-1;i++)
        {
            int min=Integer.MAX_VALUE;
            mindx=-1;
            for(j=i;j<n;j++)
            {
                if(arr[j]<min)
                {
                    min=arr[j];
                    mindx=j;
                }
            }
            //swap arr[i] and arr[mindx]
            temp=arr[i];
            arr[i]=arr[mindx];
            arr[mindx]=temp;
        }
        System.out.println("Printing the array:");
        for(i=0;i<n;i++)
        System.out.print(arr[i]+" ");


        }
        
    }
    

