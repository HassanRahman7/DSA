package arrays;

import java.util.Scanner;

public class NEXTGREATESTELEMENT 
{
    public static int greatest(int arr[],int i,int n) 
    {
        int c,max;
        max=arr[i];
        for(c=i;c<n;c++)
        {
            if(arr[c]>max)
            max=arr[c];
        }
        return max;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int i,n;
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        int arr[]=new int[n];
        int brr[]=new int[n];
        System.out.println("Enter the elements in the array:");
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        for(i=0;i<n-1;i++)
            brr[i]=greatest(arr,i+1,n);
        brr[n-1]=-1;
        System.out.println("Printing the modified array:");
        for(i=0;i<n;i++)
        System.out.print(brr[i]+" ");

    }
    
}
