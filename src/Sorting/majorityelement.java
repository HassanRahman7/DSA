package Sorting;

import java.util.Scanner;

public class majorityelement 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int i,n,j,temp,c=1;
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array:");
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        for(i=1;i<n;i++)
        {
            for(j=i;j>=1;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else
                break;
            }
        }
        for(i=0;i<n-1;i++)
        {
            if(arr[i]==arr[i+1])
            c++;
            else
            c=1;
            if(c>n/2)
            System.out.println("majority element:"+arr[i]);
            
        }
    }
        
    }
    

