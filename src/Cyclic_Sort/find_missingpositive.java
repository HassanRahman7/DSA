package Cyclic_Sort;

import java.util.Scanner;

public class find_missingpositive 
{
    public static void swap(int arr[],int i,int j) 
    {
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int firstMissingPositive(int[] arr) 
    {
        int i=0;
        while(i!=arr.length)
        {
            if(arr[i]<=0)
                i++;
            else if(arr[i]>arr.length)
                i++;
            else if(arr[i]!=arr[arr[i]-1])
                swap(arr,i,arr[i]-1); 
            else if(arr[i]==i+1)
                i++;
            else if(arr[i]==arr[arr[i]-1])
                i++;
        }
        i=0;
        while(i!=arr.length)
        {
            if(arr[i]==i+1)
            i++;
            else if(arr[i]<=0)
            return i+1;
            else 
            return i+1;
        }
        return i+1;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n,i;
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array:");
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        System.out.println("Missing number="+firstMissingPositive(arr));
    }
}
