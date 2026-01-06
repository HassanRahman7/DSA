package AdvancedSorting;

import java.util.Scanner;

public class Inversioncount 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int j,i,n,c=0;
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array:");
        for(i=0;i<n;i++)
            arr[i]=sc.nextInt();
        for(i=0;i<n-1;i++)
        {
           for(j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                    c++;
            }
        }
        System.out.println(c);
        //o(n^2)
    }
    
}
