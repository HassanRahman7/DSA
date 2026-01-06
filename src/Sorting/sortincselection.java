package Sorting;

import java.util.Scanner;

public class sortincselection 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int j,i,n,max,temp,maxind;
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array:");
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        for(i=0;i<n-1;i++)
        {
            max=Integer.MIN_VALUE;
            maxind=-1;
            for(j=i;j<n;j++)
            {
                if(arr[j]>max)
                {
                    max=arr[j];
                    maxind=j;
                }
            }
            temp=arr[i];
            arr[i]=arr[maxind];
            arr[maxind]=temp;
        }
        System.out.println("Printing the modified array:");
        for(i=0;i<n;i++)
        System.out.print(arr[i]+" ");
    }
    
}
