package Cyclic_Sort;

import java.util.Scanner;

public class missing_Number 
{
    public static int missingNumber(int[] arr) 
    {
        boolean check[]=new boolean[arr.length+1];
        int i;
        for(i=0;i<arr.length;i++)
            check[i]=false;
        for(i=0;i<arr.length;i++)
            check[arr[i]]=true;
        for(i=0;i<check.length;i++)
        {
            if(check[i]==true)
            continue;
            else
            return i;
        }
        return 2;
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
