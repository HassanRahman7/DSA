package String;

import java.util.Arrays;
import java.util.Scanner;

public class hasan2 
{
    
    public static boolean isUnique(int arr[]) 
    {
        Arrays.sort(arr);
        int i;
        for(i=0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1])
            return true;
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
        System.out.println("Has unique element.");
        else
        System.out.println("Does not have unique element.");

        
    }
    
}
