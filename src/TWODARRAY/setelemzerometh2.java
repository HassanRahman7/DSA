package TWODARRAY;

import java.util.Scanner;

public class setelemzerometh2 
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
        System.out.println("Enter elements in the array:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        boolean row[]=new boolean[m];
        boolean col[]=new boolean[n];
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                if(arr[i][j]==0)
                {
                    row[i]=true;
                    col[j]=true;
                }
            }
        }
        for(i=0;i<m;i++)
        {
            if(row[i]==true)
            rowzero(arr, i, n);
        }
        for(j=0;j<n;j++)
        {
            if(col[j]==true)
            colzero(arr, j, m);
        }
        System.out.println("Printing the modified array:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
