package TWODARRAY;

import java.util.Scanner;

public class transpose 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int m,n,i,j;
        System.out.println("Enter the number of rows in the 2d array:");
        m=sc.nextInt();
        System.out.println("Enter the number of columns:");
        n=sc.nextInt();
        int arr[][]=new int[m][n];
        int brr[][]=new int[n][m];
        System.out.println("Enter the elements in the array:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                brr[i][j]=arr[j][i];
            }
        }
        System.out.println("Printing the transpose of the array:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                System.out.print(brr[i][j]+" ");
            }
            System.out.println();
        }        
    }
    
}
