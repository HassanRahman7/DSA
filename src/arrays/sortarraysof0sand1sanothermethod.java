package arrays;

import java.util.Scanner;

public class sortarraysof0sand1sanothermethod 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int c=0,i,n;
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array:");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]==0)
            c++;
        }
        for(i=0;i<c;i++)
            arr[i]=0;
        for(i=c;i<n;i++)
        arr[i]=1;
        System.out.println("Printing the modified array:");
        for(i=0;i<n;i++)
        System.out.print(arr[i]+" ");
    }
}



        
