package Binarysearch;

import java.util.Scanner;

public class maxcountofposandneginteger 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int i,n,ne=0,po=0;
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements in the array:");
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(arr[i]<0)
            ne++;
            if(arr[i]>0)
            po++;
        }
        if(ne>po)
        System.out.println(ne);
        else
        System.out.println(po);
    
        
    }

    
}
