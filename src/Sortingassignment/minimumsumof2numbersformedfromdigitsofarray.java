package Sortingassignment;

import java.util.Arrays;
import java.util.Scanner;

public class minimumsumof2numbersformedfromdigitsofarray 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int i,n;
        String num1="",num2="";
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array:");
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        Arrays.sort(arr);
        for(i=0;i<n;i++)
        {
            if(i%2==0)
            num1=num1+arr[i];
            else
            num2=num2+arr[i];
        }
        System.out.println(Integer.parseInt(num1)+Integer.parseInt(num2));   
    }
}
