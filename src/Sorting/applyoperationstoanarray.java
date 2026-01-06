package Sorting;

import java.util.Scanner;
//apply operations to an array leetcode 2460.
public class applyoperationstoanarray 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int j,i,n,temp;
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array:");
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        for(i=0;i<n-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                arr[i]=arr[i]*2;
                arr[i+1]=0;
            }
        }
        for(i=0;i<n-1;i++)
        {
            boolean flag=true;
            for(j=0;j<n-1-i;j++)
            {
                if(arr[j]==0)
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=false;
                }
            }
            if(flag==true)
            break;
        }
        for(i=0;i<n;i++)
        System.out.print(arr[i]+" ");
        
    }
    
}
