package Arraysassignement;

import java.util.Scanner;

public class palindrome 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int a=0,j,i,n;
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array:");
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        j=n-1;
        for(i=0;i<n/2;i++)
        {
            if(arr[i]==arr[j])
            {
                j--;
                continue;

            }
            else
            {
                a++;
                System.out.println("Not a palindrome array.");
                break;
            }
        }
        if(a==0)
        System.out.println("Palindrome array.");
        
        


        
    }
    
}
