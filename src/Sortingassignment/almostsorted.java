package Sortingassignment;

import java.util.Arrays;
import java.util.Scanner;

public class almostsorted 
{
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
        {
            arr[i]=sc.nextInt();
            brr[i]=arr[i];
        }
        boolean flag=true;
        Arrays.sort(brr);
        for(i=1;i<n-2;i++)
        {
            if(arr[i]==brr[i-1]||arr[i]==brr[i]||arr[i]==brr[i+1])
            continue;
            else
            {
                flag=false;
                System.out.println("Not almost sorted");
                break;
            }
        }
        if(flag==true)
        System.out.println("Almost sorted.");
        
    }
    
}
