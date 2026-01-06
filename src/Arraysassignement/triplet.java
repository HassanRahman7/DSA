package Arraysassignement;

import java.util.Scanner;

public class triplet 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int j,k,i,n,x,t=0;
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array:");
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        System.out.println("Enter the value of x");
        x=sc.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                for(k=j+1;k<n;k++)
                {
                    if(arr[i]+arr[j]+arr[k]==x)
                    t++;
                }
            }
        }
        System.out.println("The number of triplets="+t);
        
    }
    
}
