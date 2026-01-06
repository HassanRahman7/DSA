package Sorting;

import java.util.Scanner;
//remove element from leetcode question27
public class removeelement2 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int j,i,n,val,temp;
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array:");
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        System.out.println("Enter the value of val:");
        val=sc.nextInt();
        for(i=0;i<n-1;i++)
        {
            boolean flag=true;
            for(j=0;j<n-1-i;j++)
            {
                if(arr[j]==val)
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
        {
            if(arr[i]==val)
            break;
        }
        System.out.println("array:");
        for(i=0;i<n;i++)
        System.out.print(arr[i]+" ");
        System.out.println();
        System.out.println(i);

    }
    
}
