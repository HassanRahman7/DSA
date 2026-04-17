package Arraysassignement;

import java.util.Scanner;

public class duplicate 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int c=0,i,n,j;
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        System.out.println("Enter elements in the array:");
        int arr[]=new int[n];
        for(i=0;i<n;i++)
            arr[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println("Duplicate element found "+arr[i]+" at position="+(j-1));
                    c++;
                    break;
                }
            }
            
        }
        if(c==0)
            System.out.println("No duplicate element found.");


        
    }
    
}
