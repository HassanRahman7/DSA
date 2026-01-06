package leetcode;

import java.util.Scanner;

public class specialarray1608 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int p=0,n,i,j,max,c=0;
        n=sc.nextInt();
        System.out.println("Enter the elements in the array:");
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        max=arr[0];
        for(i=1;i<n;i++)
        {
            if(arr[i]>max)
            max=arr[i];
        }
        for(i=1;i<=max;i++)
        {
            for(j=0;j<n;j++)
            {
                if(arr[j]>=i)
                c++;
            }
            if(c==i)
            {
                p++;
                break;
            }
            c=0;
        }
        if(p==1)
        System.out.println("Special");
        else
        System.out.println("Not special");

        }
    }
    

