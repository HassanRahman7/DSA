package arrays;

import java.util.Scanner;

public class sortarraysof0sand1s 
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
        arr[i]=sc.nextInt();
        int brr[]=new int[n];
        for(i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                brr[c]=0;
                c++;
            }
        }
        for(i=0;i<n;i++)
        {
            if(arr[i]==1)
            {
                brr[c]=1;
                c++;
            }
        }
        System.out.println("Printing the modified array:");
        for(i=0;i<n;i++)
        System.out.print(brr[i]+" ");
    }
}
