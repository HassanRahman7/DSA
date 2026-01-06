package arrays;

import java.util.Scanner;

public class NEXTGREATESTELEMENTMETHOD2 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int nge,i,n;
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        int arr[]=new int[n];
        int brr[]=new int[n];
        System.out.println("Enter the elements in the array:");
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        brr[n-1]=-1;
        nge=arr[n-1];
        brr[n-2]=nge;
        for(i=n-2;i>=1;i--)
        {
            if(arr[i]>nge)
            nge=arr[i];
            brr[i-1]=nge;
        }
        System.out.println("Printing the modified array:");
        for(i=0;i<n;i++)
        System.out.print(brr[i]+" ");

        
    }
    
}
