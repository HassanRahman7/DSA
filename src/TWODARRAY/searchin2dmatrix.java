package TWODARRAY;

import java.util.Scanner;

//leetcode 240
public class searchin2dmatrix 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int i,j,m,n,t,k=0;
        System.out.println("Enter the number of rows:");
        m=sc.nextInt();
        System.out.println("Enter the number of columns:");
        n=sc.nextInt();
        System.out.println("Enter the elements in the array:");
        int arr[][]=new int[m][n];
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the value to be searched:");
        t=sc.nextInt();
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                if(arr[i][j]==t)
                {
                    System.out.println("Search successful.");
                    k++;
                    break;
                }
            }
            if(k==1)
            break;
        }
        if(k==0)
        System.out.println("Search unsuccessful.");


        
    }

    
}
