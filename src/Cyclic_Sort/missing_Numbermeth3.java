package Cyclic_Sort;

import java.util.Scanner;

public class missing_Numbermeth3 
{
    public static int missingNumber(int[] arr) 
    {
        int i=0,s=0,s1=0;
        s1=(arr.length*(arr.length+1))/2;
        for(i=0;i<arr.length;i++)
        s=s+arr[i];
        return s1-s;
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
