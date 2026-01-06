package TWODARRAY;

import java.util.Scanner;

public class setelementszerometh3 
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
        int i,j,m,n;
        boolean zerorow=false,zerocol=false;
        System.out.println("Enter the number of rows:");
        m=sc.nextInt();
        System.out.println("Enter the number of columns:");
        n=sc.nextInt();
        int arr[][]=new int[m][n];
        System.out.println("Enter the elements in the array:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<m;i++)
        {
            if(arr[i][0]==0)
            zerocol=true;
        }
        for(j=0;j<n;j++)
        {
            if(arr[0][j]==0)
            zerorow=true;
        }
        for(i=1;i<m;i++)
        {
            for(j=1;j<n;j++)
            {
                if(arr[i][j]==0)
                {
                    arr[0][j]=0;
                    arr[i][0]=0;
                }
            }
        }
        for(i=1;i<m;i++)
        {
            if(arr[i][0]==0)
            rowzero(arr, i, n);
        }
        for(j=1;j<n;j++)
        {
            if(arr[0][j]==0)
            colzero(arr, j, m);
        }
        if(arr[0][0]==0)
        {
            rowzero(arr, 0, n);
            colzero(arr, 0, m);
        }
        if(zerorow==true)
        rowzero(arr, 0, n);
        if(zerocol==true)
        colzero(arr, 0, m);
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
