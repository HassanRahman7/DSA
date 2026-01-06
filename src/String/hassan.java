package String;

import java.util.Scanner;

public class hassan 
{
    public static boolean isUnique(int arr[]) 
    {
        // Ek array ha usme koi duplicate element present ha ya nhi agr ha then true nhi ha to false
        int i,j;
        for(i=0;i<arr.length;i++)
        {
            for(j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                return true;
                else
                continue;
            }
        }
        return false; 
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int i,n;
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array:");
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        if(isUnique(arr)==true)
        System.out.println("It has unique elements.");
        else
        System.err.println("It doesn't have unique elements.");


        
    }
}
