package TWODARRAY;

import java.util.Scanner;

public class addition 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int j,i,m,n;
        System.out.println("Enter the number of rows:");
        m=sc.nextInt();
        System.out.println("Enter the number of columns:");
        n=sc.nextInt();
        int arr[][]=new int[m][n];
        int brr[][]=new int[m][n];
        System.out.println("Enter the elements in the first array:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements in the second array:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                brr[i][j]=sc.nextInt();
            }
        }
        int crr[][]=new int[m][n];
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                crr[i][j]=arr[i][j]+brr[i][j];
            }
        }
        System.out.println("Summation array is:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(crr[i][j]+" ");
            }
            System.out.println();
        }

    }
    
}
