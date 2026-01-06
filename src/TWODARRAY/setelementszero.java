package TWODARRAY;

import java.util.Scanner;
//leetcode 73
public class setelementszero 
{
    public static void rowzero(int arr[][],int i, int n) 
    {
        int j;
        for(j=0;j<n;j++)
        arr[i][j]=0;
    }
    public static void colzero(int arr[][],int j,int m) 
    {
        int i;
        for(i=0;i<m;i++)
        arr[i][j]=0;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int m,n,i,j;
        System.out.println("Enter the number of rows:");
        m=sc.nextInt();
        System.out.println("Enter the number of columns:");
        n=sc.nextInt();
        int arr[][]=new int[m][n];
        int brr[][]=new int[m][n];
        System.out.println("Enter elements in the array:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                brr[i][j]=arr[i][j];
            }
        }
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                if(arr[i][j]==0)
                {
                    rowzero(brr, i, n);
                    colzero(brr, j, m);
                }
            }
        }
        System.out.println("Displaying the modified matrix:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(brr[i][j]+" ");
            }
            System.out.println();
        }

        
    }

    
}
