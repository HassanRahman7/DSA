package Sorting;

import java.util.Scanner;

public class question8_2 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int j,n,i,min,mindx,c=0;
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array:");
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            min=Integer.MAX_VALUE;
            mindx=-1;
            for(j=0;j<n;j++)
            {
                if(arr[j]<=0)
                continue;
                else if(arr[j]<min)
                {
                    min=arr[j];
                    mindx=j;
                }
            }
            arr[mindx]=c--;

        }
        for(i=0;i<n;i++)
        {
            arr[i]=arr[i]*-1;
            System.out.print(arr[i]+" ");
        }
    }
}