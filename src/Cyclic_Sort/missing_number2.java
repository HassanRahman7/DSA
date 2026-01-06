package Cyclic_Sort;

import java.util.Scanner;

public class missing_number2 
{
    public static void swap(int arr[],int i,int j) 
    {
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int missingNumber(int[] arr) 
    {
        int i=0;
        while(i!=arr.length)
        {
            if(arr[i]==arr.length)
                i++;
            else if(arr[i]!=i)
                swap(arr,i,arr[i]);
            else
                i++;
        }
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]!=i)
            return i;
        }
        return arr.length;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n,i;
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements from 0 to n+1:");
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        System.out.println("Missing number="+missingNumber(arr));
    }
}
