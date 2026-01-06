package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class question8 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int c=0,mindx,min,i,n,j,temp;
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array:");
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        int brr[]=new int[n];
        for(i=0;i<n;i++)
        brr[i]=arr[i];
        Arrays.sort(brr);
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(brr[i]==arr[j])
                arr[j]=c++;
            }
        }
        /*for(i=0;i<n-1;i++)
        {
            min=Integer.MAX_VALUE;
            mindx=-1;
            for(j=i;j<n;j++)
            {
                if(arr[j]<min);
                {
                    min=arr[j];
                    mindx=j;
                }
            }
            brr[mindx]=c++;
            System.out.println(brr[mindx]);
            temp=arr[mindx];
            arr[mindx]=arr[i];
            arr[i]=temp;
        }*/
        System.out.println("Updated array:");
        for(i=0;i<n;i++)
        System.out.print(arr[i]+" ");
        
    }
    
}
