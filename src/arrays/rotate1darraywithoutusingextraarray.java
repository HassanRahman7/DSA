package arrays;

import java.util.Scanner;
    
public class rotate1darraywithoutusingextraarray 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int i,n,k;
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array:");
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        System.out.println("Enter the number of times you want to make rotations:");
        k=sc.nextInt();
        k=k%n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
        for(i=0;i<n;i++)
        System.out.print(arr[i]+" ");
    }
    public static void reverse(int arr[],int i,int j)
    {
        while(i<=j)
        {
            int temp;
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}