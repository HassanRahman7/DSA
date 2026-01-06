package Sortingassignment;

import java.util.Arrays;
import java.util.Scanner;

public class KTHsmallestelementinunsortedarray 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int k,i,n;
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array:");
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        Arrays.sort(arr);
        System.out.println("Enter the value of k");
        k=sc.nextInt();
        System.out.println(arr[k-1]);
    }
}
